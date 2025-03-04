package com.xworkz.bank.repositary;

import com.xworkz.bank.entity.BankAccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

    @Autowired
   EntityManagerFactory emf;

    @Override
    public boolean save(BankAccountEntity entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<BankAccountEntity> getAllAccounts() {
        EntityManager em = emf.createEntityManager();
        return emf.createEntityManager().createNamedQuery("getAllUser").getResultList();
    }

    @Override
    public void deleteAccountById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public BankAccountEntity getAccountById(Integer id) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findById").setParameter("id", id);
        return (BankAccountEntity) query.getSingleResult();
    }

    @Override
    public boolean updateAccount(BankAccountEntity updatedAccount) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.find(BankAccountEntity.class, updatedAccount.getId());
        em.merge(updatedAccount);
        em.getTransaction().commit();
        em.close();

        return true;
    }
}
