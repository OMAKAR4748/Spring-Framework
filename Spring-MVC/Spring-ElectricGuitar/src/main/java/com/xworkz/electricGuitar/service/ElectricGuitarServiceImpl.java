package com.xworkz.electricGuitar.service;

import com.xworkz.electricGuitar.dto.ElectricGuitarDto;
import com.xworkz.electricGuitar.entity.ElectricGuitarEntity;
import com.xworkz.electricGuitar.repositary.ElectricGuitarRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectricGuitarServiceImpl implements ElectricGuitarService{
    @Autowired
    ElectricGuitarRepositary repositary;

    @Override
    public boolean validateAndSave(ElectricGuitarDto dto) {
        ElectricGuitarEntity entity = new ElectricGuitarEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean saved = repositary.save(entity);
        System.out.println("Data saved");
        return saved;
    }

    @Override
    public Object getById(Integer id) {
        Object res = repositary.getById(id);
        return res;
    }

    @Override
    public int getModelByBodyMaterial(String model, String bodyMaterial) {
       int res = repositary.getModelByBodyMaterial(model, bodyMaterial);
        return res;
    }
}
