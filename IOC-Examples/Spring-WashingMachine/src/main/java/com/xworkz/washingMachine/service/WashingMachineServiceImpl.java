package com.xworkz.washingMachine.service;

import com.xworkz.washingMachine.dto.WashingMachineDto;
import com.xworkz.washingMachine.entity.WashingMachineEntity;
import com.xworkz.washingMachine.repositary.WashingMachineRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WashingMachineServiceImpl implements WashingMachineService{

    @Autowired
    WashingMachineRepositary repositary;
    @Override
    public boolean validateAndSave(WashingMachineDto dto) {
        WashingMachineEntity entity = new WashingMachineEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean saved = repositary.save(entity);
        System.out.println("Data saved");
        return saved;
    }
}
