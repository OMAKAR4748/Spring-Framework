
package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;


import java.util.List;

public interface UserRepository {

    boolean save(UserEntity userEntity);

    List<UserEntity> getAll() ;

    void deleteUserById(int id);

    UserEntity findById(Integer id);

    boolean updateUser(UserEntity userFormEntity);

}
