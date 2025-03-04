package com.xworkz.bank.controller;

import com.xworkz.bank.dto.BankAccountDto;
import com.xworkz.bank.entity.BankAccountEntity;
import com.xworkz.bank.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    public BankAccountController() {
        System.out.println("BankAccountController Object Created");
    }

    @PostMapping("addUser")
    public String addAccount(BankAccountDto dto, Model model) {
        bankAccountService.addAccount(dto);
        model.addAttribute("accountHolderName",dto);
        return "accountResponse.jsp";
    }

    @GetMapping("viewAll")
    public String getAllAccounts(Model model) {
        List<BankAccountDto> dto = bankAccountService.fetchAllAccounts();
        System.out.println(dto);
        model.addAttribute("list",dto);
        return "getAllAccounts.jsp";
    }

    @RequestMapping("deleteUser")
    public RedirectView deleteAccountById(@RequestParam("id") String id, HttpServletRequest req) {
        bankAccountService.removeAccountById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(req.getContextPath() + "/viewAll");
        return redirectView;
    }

    @RequestMapping("editUser")
    public String getAccountById(@RequestParam("id") Integer id, Model model) {
        BankAccountEntity entity = bankAccountService.fetchAccountById(id);
        System.out.println(entity);
        model.addAttribute("item",entity);
        return "UpdatePage.jsp";
    }

    @RequestMapping("updateUser")
    public String updateAccount(@RequestParam BankAccountDto bankAccountDto, Model model) {
       bankAccountService.modifyAccount(bankAccountDto);
        model.addAttribute("msg", "User data Updated Successfully..!");

        return "updateResponse.jsp";
    }

}
