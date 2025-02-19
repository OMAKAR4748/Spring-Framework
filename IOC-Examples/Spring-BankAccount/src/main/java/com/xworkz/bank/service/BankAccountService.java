package com.xworkz.bank.service;


import com.xworkz.bank.dto.BackAccountDto;

public interface BankAccountService {
    boolean validateAndSave(BackAccountDto dto);
}
