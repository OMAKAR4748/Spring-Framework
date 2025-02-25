package com.xworkz.vacuumCleaner.repositary;

import com.xworkz.vacuumCleaner.entity.VacuumCleanerEntity;

import java.util.List;

public interface VacuumCleanerRepositary {
    boolean save(VacuumCleanerEntity entity);

    List<VacuumCleanerEntity> getAllData();

    Object getById(Integer id);

    int UpdatePriceByBrand(double price, String brand);

    String deleteData(Integer id);

    int UpdatePriceByModel(String model, double price);

}

