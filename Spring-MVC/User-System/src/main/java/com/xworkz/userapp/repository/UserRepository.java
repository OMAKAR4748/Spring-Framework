package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    boolean save(UserEntity entity);

    List<UserEntity> getAllUser();

    String deleteUserById(Integer id);

    void updateUser(UserEntity updatedUser);

    Optional<UserEntity> updateUserById(int id, String firstName, String lastName, String email, Long phoneNumber);


}
