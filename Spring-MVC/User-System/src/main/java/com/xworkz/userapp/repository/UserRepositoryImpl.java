package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{


    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");


    @Override
    public boolean save(UserEntity entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public List<UserEntity> getAllUser() {
        EntityManager em = emf.createEntityManager();
        List<UserEntity> users = em.createNamedQuery("getAllUser").getResultList();
        System.out.println(users);
        return users;
    }

    @Override
    public String deleteUserById(Integer id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            UserEntity user = em.find(UserEntity.class, id);
            if (user != null) {
                em.remove(user);
            }
            et.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
        } finally {
            em.close();
        }

        return null;
    }

    @Override
    public void updateUser(UserEntity updatedUser) {
        EntityManager entityManager = emf.createEntityManager();
        UserEntity user = entityManager.find(UserEntity.class, updatedUser.getId());
        if (user != null) {
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            entityManager.merge(user);
        }
    }

    @Override
    public Optional<UserEntity> updateUserById(int id, String firstName, String lastName, String email, Long phoneNumber) {
        EntityManager entityManager = emf.createEntityManager();
        UserEntity user = entityManager.find(UserEntity.class, id);
        if (user == null) {
            throw new NullPointerException("User not found for ID: " + id);
        }
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        entityManager.merge(user);
        return null;
    }

}
