package com.xworkz.bag.controller;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.service.BagService;
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
public class BagController {

    public BagController(){
        System.out.println("NO-args const object is created");
    }

    @Autowired
    BagService bagService;

    @PostMapping("addBags")
    public String GetBag(BagDto dto, Model model){
        bagService.addBag(dto);
        model.addAttribute("brand",dto);
        return "response.jsp";
    }

    @GetMapping("getAll")
    public String getAllBags(Model model) {
        List<BagDto> dto = bagService.getAllBags();
        System.out.println(dto);
        model.addAttribute("list", dto);
        return "getAll.jsp";
    }

    @RequestMapping("deleteBag")
    public RedirectView deleteById(@RequestParam("id") String id, HttpServletRequest req){
        bagService.deleteById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(req.getContextPath() + "/getAll");
        return redirectView;
    }

    @RequestMapping("editBag")
    public String findById(@RequestParam("id") int id, Model model){
        BagEntity entity=bagService.findById(id);
        System.out.println("Controller :"+entity);
        model.addAttribute("item",entity);
        return "updatePage.jsp";
    }

    @RequestMapping("updateData")
    public String updateBag(BagDto dto, Model model){
        bagService.updateBag(dto);
        model.addAttribute("brand", dto.getBrand());
        return "updateResponse.jsp";
    }

}
