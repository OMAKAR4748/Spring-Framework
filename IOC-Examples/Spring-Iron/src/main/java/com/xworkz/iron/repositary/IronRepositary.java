package com.xworkz.iron.repositary;

import com.xworkz.iron.entity.IronEntity;

import java.util.List;

public interface IronRepositary {
    boolean save(IronEntity entity);

    Object getById(Integer id);

    String UpdatePriceByBrand(double price, String brand);

    String deleteData(Integer id);

    List<IronEntity> getAllData();


}
