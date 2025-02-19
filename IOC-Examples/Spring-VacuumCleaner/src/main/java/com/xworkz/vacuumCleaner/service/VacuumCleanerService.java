package com.xworkz.vacuumCleaner.service;

import com.xworkz.vacuumCleaner.dto.VacuumCleanerDto;
import com.xworkz.vacuumCleaner.entity.VacuumCleanerEntity;

import java.util.List;

public interface VacuumCleanerService {
    boolean validateAndSave(VacuumCleanerDto dto);

    Object getById(Integer id);

    int UpdatePriceByBrand(double price, String brand);

    int UpdateModelByPrice(String model, double price);


    String deleteData(Integer id);

    List<VacuumCleanerEntity> getAllData();

}
