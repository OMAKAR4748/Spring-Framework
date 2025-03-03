
package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;


import java.util.List;

public interface UserService {

    boolean validateAndSave(UserDto userDto);

    List<UserDto> getAll();

    void deleteUserById(int id);

    UserEntity findById(Integer id);

    boolean updateUser(UserDto userDto);
}
