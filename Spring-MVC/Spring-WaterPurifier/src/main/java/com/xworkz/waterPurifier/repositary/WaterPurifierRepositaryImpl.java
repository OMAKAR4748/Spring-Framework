package com.xworkz.waterPurifier.repositary;

import com.xworkz.waterPurifier.entity.WaterPurifierEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@Component
public class WaterPurifierRepositaryImpl implements WaterPurifierRepositary{
    @Override
    public boolean save(WaterPurifierEntity entity) {
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
    public List<WaterPurifierEntity> getAllData() {
       List<WaterPurifierEntity> entity =  Persistence.createEntityManagerFactory("ecommerce").createEntityManager().createNamedQuery("getAllData").getResultList();
        return entity;
    }

    @Override
    public WaterPurifierEntity getById(Integer id) {
        WaterPurifierEntity entity = (WaterPurifierEntity) Persistence.createEntityManagerFactory("ecommerce").createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
        return entity;
    }

    @Override
    public Boolean updateIdByPrice(Integer id, double price) {
        EntityManager em =Persistence.createEntityManagerFactory("ecommerce").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        int update =em.createNamedQuery("updateIdByPrice").setParameter("id",id).setParameter("price",price).executeUpdate();
        et.commit();
        if (update>0)
        {
            System.out.println("Data Updated");
        }else {
            System.out.println("Data is not Updated");
        }
        return false;
    }
}
