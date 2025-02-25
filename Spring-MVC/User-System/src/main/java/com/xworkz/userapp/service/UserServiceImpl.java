package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;
import com.xworkz.userapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveUser(UserDto dto) {
        if (dto != null) {
            UserEntity entity = new UserEntity();
            BeanUtils.copyProperties(dto, entity);
            return userRepository.save(entity);
        }
        return false;
    }

    @Override
    public List<UserDto> getAllUser() {
        List<UserEntity> entityList = userRepository.getAllUser();
        List<UserDto> userDtos = new ArrayList<>();
        for (UserEntity entity : entityList) {
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(entity, dto);
            userDtos.add(dto);
        }
        return userDtos;
    }

    @Override
    public String deleteUserById(Integer id) {
        return userRepository.deleteUserById(id);

    }

    @Override
    public void updateUser(UserDto dto) {
        if (dto == null || dto.getId() == null) {
            throw new NullPointerException("User ID cannot be null for update.");
        }

        Optional<UserEntity> optionalUser = userRepository.updateUserById(dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getEmail(), dto.getPhoneNumber());

        if (!optionalUser.isPresent()) {
            throw new NullPointerException("User not found for ID: " + dto.getId());
        }

        UserEntity user = optionalUser.get();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());

        userRepository.save(user);
    }

}
