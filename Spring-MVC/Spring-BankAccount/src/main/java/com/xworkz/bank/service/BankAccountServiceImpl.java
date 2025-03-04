package com.xworkz.bank.service;

import com.xworkz.bank.dto.BankAccountDto;
import com.xworkz.bank.entity.BankAccountEntity;
import com.xworkz.bank.repositary.BankAccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public boolean addAccount(BankAccountDto dto) {

        BankAccountEntity bankEntity = new BankAccountEntity();

        bankEntity.setAccountNumber(bankEntity.getAccountNumber());
        bankEntity.setAccountHolderName(bankEntity.getAccountHolderName());
        bankEntity.setBalance(bankEntity.getBalance());
        bankEntity.setAccountType(bankEntity.getAccountType());

        bankAccountRepository.save(bankEntity);

        return true;
    }

    @Override
    public List<BankAccountDto> fetchAllAccounts() {
        List<BankAccountDto> dtos = new ArrayList<>();
        List<BankAccountEntity> entities = bankAccountRepository.getAllAccounts();
        for (BankAccountEntity bankEntity :entities)
        {
            BankAccountDto dto = new BankAccountDto();
            BeanUtils.copyProperties(bankEntity, dto);
            dtos.add(dto);
        }
        return dtos;
    }


    @Override
    public void removeAccountById(int id) {
        bankAccountRepository.deleteAccountById(id);

    }

    @Override
    public BankAccountEntity fetchAccountById(Integer id) {
        return bankAccountRepository.getAccountById(id);
    }

    @Override
    public boolean modifyAccount(BankAccountDto bankAccountDto) {
        BankAccountEntity entity = new BankAccountEntity();
        BeanUtils.copyProperties(bankAccountDto,entity);
        bankAccountRepository.updateAccount(entity);
        return true;
    }

}
