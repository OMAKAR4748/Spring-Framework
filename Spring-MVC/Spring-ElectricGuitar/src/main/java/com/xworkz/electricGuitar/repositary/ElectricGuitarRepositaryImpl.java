package com.xworkz.electricGuitar.repositary;

import com.xworkz.electricGuitar.entity.ElectricGuitarEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Component
public class ElectricGuitarRepositaryImpl implements ElectricGuitarRepositary{
    @Override
    public boolean save(ElectricGuitarEntity entity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(entity);
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

    @Override
    public Object getById(Integer id) {
        Object res = Persistence.createEntityManagerFactory("ecommerce").createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
        return res;
    }

    @Override
    public int getModelByBodyMaterial(String model, String bodyMaterial) {
        EntityManager em = Persistence.createEntityManagerFactory("ecommerce").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        int update = em.createNamedQuery("UpdateModelByBodyMaterial").setParameter("model", model).setParameter("bodyMaterial", bodyMaterial).executeUpdate();
        et.commit();
        if (update > 0) {
            System.out.println("Data Updated");
        } else {
            System.out.println("Data is not Updated");
        }return update;
    }
}
