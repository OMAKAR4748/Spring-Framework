
package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");



    @Override
    public boolean save(UserEntity userEntity) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(userEntity);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<UserEntity> getAll() {
        EntityManager em = emf.createEntityManager();

        return emf.createEntityManager().createNamedQuery("findAll").getResultList();
    }

    @Override
    public void deleteUserById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteUser").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();

    }

    @Override
    public UserEntity findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findById").setParameter("id", id);
        System.out.println("Repo :" + query.getSingleResult());
        return (UserEntity) query.getSingleResult();
    }

    @Override
    public boolean updateUser(UserEntity userFormEntity) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        UserEntity userFormEntitys = em.find(UserEntity.class, userFormEntity.getId());
        if (userFormEntitys != null) {
            em.merge(userFormEntity);
            em.getTransaction().commit();
        }
        em.close();
        return true;
    }
}
