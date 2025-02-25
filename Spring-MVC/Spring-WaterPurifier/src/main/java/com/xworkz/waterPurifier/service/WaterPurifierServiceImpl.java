package com.xworkz.waterPurifier.service;

import com.xworkz.waterPurifier.dto.WaterPurifierDto;
import com.xworkz.waterPurifier.entity.WaterPurifierEntity;
import com.xworkz.waterPurifier.repositary.WaterPurifierRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WaterPurifierServiceImpl implements WaterPurifierService{

    @Autowired
    WaterPurifierRepositary repositary;

    @Override
    public boolean validateAndSave(WaterPurifierDto dto) {
        WaterPurifierEntity entity = new WaterPurifierEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean save = repositary.save(entity);
        System.out.println("Data saved");
        return save;
    }

    @Override
    public List<WaterPurifierEntity> getAllData() {
       List<WaterPurifierEntity> entity = repositary.getAllData();
        return entity;
    }

    @Override
    public WaterPurifierEntity getById(Integer id) {
        WaterPurifierEntity entity = repositary.getById(id);
        return entity;
    }

    @Override
    public Boolean updateIdByPrice(Integer id, double price) {
        Object result = repositary.updateIdByPrice(id, price);
        return false;
    }
}
