package com.xworkz.watch.repositary;

import com.xworkz.watch.entity.WatchEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class WatchRepositaryImpl implements WatchRepositary{
    @Override
    public boolean save(WatchEntity watchEntity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(watchEntity);
            et.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
        } finally {
            emf.close();
            em.close();
        }
        return false;
    }
}
