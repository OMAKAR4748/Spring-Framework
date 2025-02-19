package com.xworkz.laptop.repositary;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class LaptopRepositaryImpl implements LaptopRepositary{

    @Override
    public boolean save(LaptopEntity entity) {
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
