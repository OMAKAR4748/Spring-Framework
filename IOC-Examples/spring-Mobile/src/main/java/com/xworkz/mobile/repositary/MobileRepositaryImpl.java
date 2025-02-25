package com.xworkz.mobile.repositary;

import com.xworkz.mobile.entity.MobileEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class MobileRepositaryImpl implements MobileRepositary{

    @Override
    public boolean save(MobileEntity entity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try{
            et.begin();
            em.persist(entity);
            et.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            et.rollback();
        }finally {
            emf.close();
            em.close();
        }

        return false;
    }
}
