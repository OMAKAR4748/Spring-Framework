package com.xworkz.bank.repositary;

import com.xworkz.bank.entity.BankAccountEntity;

import java.util.List;
import java.util.Optional;

public interface BankAccountRepositary {
    boolean save(BankAccountEntity entity);

    List<BankAccountEntity> getAllAccounts();

    Optional<BankAccountEntity> getAccountById(Integer id);

    String deleteAccountById(Integer id);

    void updateAccount(BankAccountEntity updatedAccount);

    Optional<BankAccountEntity> updateAccountById(Integer id, double accountNumber, String accountHolderName, double balance, String accountType);
}
