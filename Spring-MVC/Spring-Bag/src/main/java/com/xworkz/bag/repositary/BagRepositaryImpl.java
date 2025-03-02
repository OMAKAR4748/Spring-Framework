package com.xworkz.bag.repositary;

import com.xworkz.bag.entity.BagEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class BagRepositaryImpl implements BagRepositary{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(BagEntity entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<BagEntity> getAllBags() {
        EntityManager em = emf.createEntityManager();
        return emf.createEntityManager().createNamedQuery("getAllBags").getResultList();
    }

    @Override
    public void deleteById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteBag").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();

    }

    @Override
    public BagEntity findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findById").setParameter("id", id);
        return (BagEntity) query.getSingleResult();

    }

    @Override
    public boolean updateBag(BagEntity updatedBag) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        BagEntity entity = em.find(BagEntity.class, updatedBag.getId());
        if (entity != null) {
            em.merge(entity);
            em.getTransaction().commit();
        }
        em.close();
        return true;
    }


}
