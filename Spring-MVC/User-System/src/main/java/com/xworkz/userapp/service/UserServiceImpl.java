package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;

import com.xworkz.userapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    UserDto dto = new UserDto();

    @Override
    public boolean validateAndSave(UserDto userDto) {

        UserEntity userFormEntity = new UserEntity();

        userFormEntity.setFirstName(userDto.getFirstName());
        userFormEntity.setLastName(userDto.getLastName());
        userFormEntity.setEmail(userDto.getEmail());
        userFormEntity.setPhoneNumber(userDto.getPhoneNumber());
        userRepository.save(userFormEntity);

        return true;
    }

    @Override
    public List<UserDto> getAll() {
        List<UserDto> userDtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepository.getAll();
        for (UserEntity entity : userEntities) {
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(entity, dto);
            userDtos.add(dto);

        }
        return userDtos;
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteUserById(id);

    }

    @Override
    public UserEntity findById(Integer id) {
        System.out.println("Service :" + userRepository.findById(id));
        return userRepository.findById(id);
    }

    @Override
    public boolean updateUser(UserDto userDto) {
        boolean isUpdated = false;
        UserEntity userEntity = new UserEntity();
        if (userDto != null) {
            BeanUtils.copyProperties(userDto, userEntity);

            isUpdated = userRepository.updateUser(userEntity);
        }
        return isUpdated;
    }
}