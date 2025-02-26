
package com.xworkz.userapp.controller;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;

import com.xworkz.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userFormService;

    public UserController() {
        System.out.println("No-Args Const of UserFormController");
    }

    @PostMapping("userPage")
    public String getUserForm(UserDto userDto, Model model) {
        userFormService.validateAndSave(userDto);
        model.addAttribute("name",userDto.getFirstName());
        return "response.jsp";
    }

    @GetMapping("getAll")
    public String getAllUser(Model model) {
        List<UserDto> dto = userFormService.getAll();
        System.out.println(dto);
        model.addAttribute("list", dto);
        return "getAllUser.jsp";
    }

    @RequestMapping("deleteUser")
    public RedirectView deleteById(@RequestParam("id") String id, HttpServletRequest req){
        userFormService.deleteUserById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(req.getContextPath() + "/getAll");
        return redirectView;
    }

    @RequestMapping("editUser")
    public String findById(@RequestParam("id") int id, Model model){
        UserEntity entity=userFormService.findById(id);
        System.out.println("Controller :"+entity);
        model.addAttribute("item",entity);
        return "updatePage.jsp";
    }

    @RequestMapping("updateData")
    public String updateUser(UserDto dto, Model model){
        userFormService.updateUser(dto);
        model.addAttribute("name", dto.getFirstName());
        return "updateResponse.jsp";
    }
}
