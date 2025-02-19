package com.xworkz.laptopDetails.repository;

import com.xworkz.laptopDetails.entity.LaptopEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class LaptopRepoImpl implements LaptopRepo{
    @Override
    public boolean save(LaptopEntity laptopEntity) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            if (laptopEntity != null) {
                entityManager.getTransaction().begin();
                entityManager.persist(laptopEntity);
                entityManager.getTransaction().commit();
                entityManager.close();
                System.out.println("data saved");
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return false;
        }
    }
}
