package com.xworkz.bank.service;

import com.xworkz.bank.dto.BankAccountDto;
import com.xworkz.bank.entity.BankAccountEntity;

import java.util.List;

public interface BankAccountService {

    boolean addAccount(BankAccountDto bankAccountDto);

    List<BankAccountDto> fetchAllAccounts();

    void removeAccountById(int id);

    BankAccountEntity fetchAccountById(Integer id);

    boolean modifyAccount(BankAccountDto bankAccountDto);

}
