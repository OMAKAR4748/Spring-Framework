package com.xworkz.iron.repositary;

import com.xworkz.iron.entity.IronEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Component
public class IronRepositaryImpl implements IronRepositary{
    @Override
    public boolean save(IronEntity entity) {
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
        return Persistence.createEntityManagerFactory("ecommerce").createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
    }

    @Override
    public String UpdatePriceByBrand(double price, String brand) {
        EntityManager em =Persistence.createEntityManagerFactory("ecommerce").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        int update =em.createNamedQuery("UpdatePriceByBrand").setParameter("price",price).setParameter("brand",brand).executeUpdate();
        et.commit();
        if (update>0)
        {
            System.out.println("Data Updated");
        }else {
            System.out.println("Data is not Updated");
        }
       return "";
    }

    @Override
    public String deleteData(Integer id) {
        EntityManager em =Persistence.createEntityManagerFactory("ecommerce").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        int remove =em.createNamedQuery("deleteData").setParameter("id",id).executeUpdate();
        et.commit();
        if (remove>0)
        {
            return "Data is Deleted";
        }else {
            return "Data is not deleted";
        }
    }

    @Override
    public List<IronEntity> getAllData() {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("ecommerce");
        List<IronEntity> result = emf.createEntityManager().createNamedQuery("getAllData").getResultList();
        return result;
    }
}
