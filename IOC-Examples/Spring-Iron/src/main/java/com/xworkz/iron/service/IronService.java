package com.xworkz.iron.service;

import com.xworkz.iron.dto.IronDto;
import com.xworkz.iron.entity.IronEntity;

import java.util.List;

public interface IronService {
    boolean validateAndSave(IronDto dto);

    Object getById(Integer id);

    String UpdatePriceByBrand(double price, String brand);

    String deleteData(Integer id);

    List<IronEntity> getAllData();


}
