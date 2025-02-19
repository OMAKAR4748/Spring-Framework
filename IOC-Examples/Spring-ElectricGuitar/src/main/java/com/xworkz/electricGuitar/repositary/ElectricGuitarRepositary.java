package com.xworkz.electricGuitar.repositary;

import com.xworkz.electricGuitar.entity.ElectricGuitarEntity;

public interface ElectricGuitarRepositary {
    boolean save(ElectricGuitarEntity entity);

    Object getById(Integer id);

    int getModelByBodyMaterial(String model, String bodyMaterial);
}
