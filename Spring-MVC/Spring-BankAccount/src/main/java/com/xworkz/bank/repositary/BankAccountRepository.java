package com.xworkz.bank.repositary;

import com.xworkz.bank.entity.BankAccountEntity;

import java.util.List;

public interface BankAccountRepository {

    boolean save(BankAccountEntity entity);

    List<BankAccountEntity> getAllAccounts();

    void deleteAccountById(int id);

    BankAccountEntity getAccountById(Integer id);

    boolean updateAccount(BankAccountEntity updatedAccount);

}
