package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.repositary.MobileRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileServiceImpl implements MobileService{

    @Autowired
    MobileRepositary mobileRepositary;

    @Override
    public boolean validateAndSave(MobileDto dto) {
        MobileEntity entity = new MobileEntity();

        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);

        boolean save = mobileRepositary.save(entity);
        System.out.println("Data saved");
        return save;
    }
}
