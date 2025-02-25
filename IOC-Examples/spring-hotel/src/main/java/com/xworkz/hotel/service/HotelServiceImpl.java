package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.repositary.HotelRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelServiceImpl implements HotelService{
    @Autowired
    HotelRepositary repositary;

    @Override
    public boolean validateAndSave(HotelDto dto) {

        HotelEntity entity = new HotelEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean save = repositary.save(entity);
        System.out.println("Data is saved");
        return save;
    }
}
