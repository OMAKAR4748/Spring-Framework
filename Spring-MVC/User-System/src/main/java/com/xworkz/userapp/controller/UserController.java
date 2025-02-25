package com.xworkz.userapp.controller;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    public UserController() {
        System.out.println("UserController Object Created");
    }

    @RequestMapping("/addUser")
    public String addUser(UserDto dto, Model model) {
        boolean saved = userService.saveUser(dto);
        if (saved) {
            model.addAttribute("name", dto.getFirstName());
            return "response.jsp";
        } else {
            model.addAttribute("error", "Failed to save user.");
            return "error";
        }
    }

    @GetMapping("viewAll")
    public String getAllUsers(Model model) {
        List<UserDto> users = userService.getAllUser();
        System.out.println(users);
        model.addAttribute("listOfUser", users);
        return "getAllUser.jsp";
    }

    @GetMapping("delete")
    public String deleteById(@RequestParam("id") Integer id,Model model ) {
        userService.deleteUserById(id);
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl(req.getContextPath() + "/getAllUser");
//        return redirectView;

        List<UserDto> users = userService.getAllUser();
        System.out.println(users);
        model.addAttribute("listOfUser", users);
        return "getAllUser.jsp";
    }

    @PostMapping("updateUser")
    public String updateUser(@ModelAttribute UserDto dto) throws NullPointerException{
        if (dto.getId() == null) {
            throw new NullPointerException("User ID cannot be null.");
        }

        userService.updateUser(dto);
        return "redirect:/getAllUser";
    }
}

