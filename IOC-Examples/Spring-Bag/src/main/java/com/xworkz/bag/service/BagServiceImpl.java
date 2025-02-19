package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.repositary.BagRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BagServiceImpl implements BagService{
    @Autowired
    BagRepositary bagRepositary;

    @Override
    public boolean validateAndSave(BagDto dto) {
        BagEntity entity = new BagEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean save = bagRepositary.save(entity);
        System.out.println("Data is saved");
        return save;
    }
}
