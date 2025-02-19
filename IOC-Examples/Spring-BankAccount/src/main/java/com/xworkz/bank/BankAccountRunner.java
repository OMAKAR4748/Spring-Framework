package com.xworkz.bank;

import com.xworkz.bank.config.SpringBankConfiguration;
import com.xworkz.bank.dto.BackAccountDto;
import com.xworkz.bank.service.BankAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAccountRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBankConfiguration.class);
        BankAccountService service = applicationContext.getBean(BankAccountService.class);

        BackAccountDto dto = new BackAccountDto();
        dto.setAccountHolderName("Omkar Desai");
        dto.setAccountNumber(56467645);
        dto.setAccountType("saving Account");
        dto.setBalance(5000);

        service.validateAndSave(dto);
    }
}
