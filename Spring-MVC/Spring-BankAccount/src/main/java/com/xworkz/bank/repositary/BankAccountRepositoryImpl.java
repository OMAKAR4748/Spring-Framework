package com.xworkz.bank.repository;

import com.xworkz.bank.entity.BankAccountEntity;
import com.xworkz.bank.repositary.BankAccountRepositary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class BankAccountRepositoryImpl implements BankAccountRepositary {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(BankAccountEntity entity) {
        if (entity != null) {
            entityManager.persist(entity);
            return true;
        }
        return false;
    }

    @Override
    public List<BankAccountEntity> getAllAccounts() {
        return entityManager.createQuery("SELECT b FROM BankAccountEntity b", BankAccountEntity.class).getResultList();
    }

    @Override
    public Optional<BankAccountEntity> getAccountById(Integer id) {
        return Optional.ofNullable(entityManager.find(BankAccountEntity.class, id));
    }

    @Override
    public String deleteAccountById(Integer id) {
        BankAccountEntity account = entityManager.find(BankAccountEntity.class, id);
        if (account != null) {
            entityManager.remove(account);
            return "Account deleted successfully";
        }
        return "Account not found";
    }

    @Override
    public void updateAccount(BankAccountEntity updatedAccount) {
        if (updatedAccount != null && updatedAccount.getId() != null) {
            entityManager.merge(updatedAccount);
        }
    }

    @Override
    public Optional<BankAccountEntity> updateAccountById(Integer id, double accountNumber, String accountHolderName, double balance, String accountType) {
        BankAccountEntity account = entityManager.find(BankAccountEntity.class, id);
        if (account != null) {
            account.setAccountNumber(accountNumber);
            account.setAccountHolderName(accountHolderName);
            account.setBalance(balance);
            account.setAccountType(accountType);
            entityManager.merge(account);
            return Optional.of(account);
        }
        return Optional.empty();
    }
}
