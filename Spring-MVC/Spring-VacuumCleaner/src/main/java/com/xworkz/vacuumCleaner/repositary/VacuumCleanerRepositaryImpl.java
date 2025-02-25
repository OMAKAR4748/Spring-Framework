package com.xworkz.vacuumCleaner.repositary;

import com.xworkz.vacuumCleaner.entity.VacuumCleanerEntity;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
public class VacuumCleanerRepositaryImpl implements VacuumCleanerRepositary{
    @Override
    public boolean save(VacuumCleanerEntity entity) {
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
    public List<VacuumCleanerEntity> getAllData() {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("ecommerce");
        List<VacuumCleanerEntity> result = emf.createEntityManager().createNamedQuery("getAllData").getResultList();
        return result;
    }

    @Override
    public Object getById(Integer id) {
      return Persistence.createEntityManagerFactory("ecommerce").createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();

    }

    @Override
    public int UpdatePriceByBrand(double price, String brand) {
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
        return update;
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
    public int UpdatePriceByModel(String model, double price) {
        EntityManager em =Persistence.createEntityManagerFactory("ecommerce").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
         int update =em.createNamedQuery("UpdateModelByPrice").setParameter("price",price).setParameter("model",model).executeUpdate();
        et.commit();
        if (update>0)
        {
            System.out.println("Data Updated");
        }else {
            System.out.println("Data is not Updated");
        }

        return update;
    }
}
