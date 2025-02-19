package com.xworkz.bank.service;

import com.xworkz.bank.dto.BackAccountDto;
import com.xworkz.bank.entity.BankAccountEntity;
import com.xworkz.bank.repositary.BankAccountRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired
    BankAccountRepositary bankAccountRepositary;

    @Override
    public boolean validateAndSave(BackAccountDto dto) {
        BankAccountEntity entity = new BankAccountEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean saved = bankAccountRepositary.save(entity);
        System.out.println("Data is Saved");
        return saved;
    }
}
