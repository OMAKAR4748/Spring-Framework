package com.xworkz.electricGuitar.service;

import com.xworkz.electricGuitar.dto.ElectricGuitarDto;

public interface ElectricGuitarService {
    boolean validateAndSave(ElectricGuitarDto dto);

    Object getById(Integer id);

    int getModelByBodyMaterial(String model, String bodyMaterial);
}
