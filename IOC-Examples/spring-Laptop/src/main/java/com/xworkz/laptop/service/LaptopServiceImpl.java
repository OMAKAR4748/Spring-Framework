package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.repositary.LaptopRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopServiceImpl implements LaptopService{

    @Autowired
    LaptopRepositary repositary;

    @Override
    public boolean validateAndSave(LaptopDto dto) {

        LaptopEntity entity = new LaptopEntity();

        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);

        boolean save = repositary.save(entity);
        System.out.println("Data saved");

        return save;
    }
}
