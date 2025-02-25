package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import java.util.List;

public interface UserService {
    boolean saveUser(UserDto dto);

    List<UserDto> getAllUser();

    String deleteUserById(Integer id);

    void updateUser(UserDto dto);


}
