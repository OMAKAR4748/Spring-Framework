package com.xworkz.waterPurifier.service;

import com.xworkz.waterPurifier.dto.WaterPurifierDto;
import com.xworkz.waterPurifier.entity.WaterPurifierEntity;

import java.util.List;

public interface WaterPurifierService {
    boolean validateAndSave(WaterPurifierDto dto);

    List<WaterPurifierEntity> getAllData();

    WaterPurifierEntity getById(Integer id);

    Boolean updateIdByPrice(Integer id,double price);

}
