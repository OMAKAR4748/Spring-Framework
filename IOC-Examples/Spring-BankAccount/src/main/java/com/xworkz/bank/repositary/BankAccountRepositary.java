package com.xworkz.bank.repositary;

import com.xworkz.bank.entity.BankAccountEntity;

public interface BankAccountRepositary {
    boolean save(BankAccountEntity entity);
}
