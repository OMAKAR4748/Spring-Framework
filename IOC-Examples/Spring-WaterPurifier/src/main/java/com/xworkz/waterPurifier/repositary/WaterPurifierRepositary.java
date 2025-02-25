package com.xworkz.waterPurifier.repositary;

import com.xworkz.waterPurifier.entity.WaterPurifierEntity;

import java.util.List;

public interface WaterPurifierRepositary {
    boolean save(WaterPurifierEntity entity);

    List<WaterPurifierEntity> getAllData();

    WaterPurifierEntity getById(Integer id);

    Boolean updateIdByPrice(Integer id,double price);
}
