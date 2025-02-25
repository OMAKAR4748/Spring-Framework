package com.xworkz.iron.service;

import com.xworkz.iron.dto.IronDto;
import com.xworkz.iron.entity.IronEntity;
import com.xworkz.iron.repositary.IronRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class IronServiceImpl implements IronService{

    @Autowired
    IronRepositary repositary;

    @Override
    public boolean validateAndSave(IronDto dto) {
        IronEntity entity = new IronEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean save = repositary.save(entity);
        System.out.println("Data saved");
        return save;
    }

    @Override
    public Object getById(Integer id) {
       Object res = repositary.getById(id);
        return res;
    }

    @Override
    public String UpdatePriceByBrand(double price, String brand) {
        String updated = repositary.UpdatePriceByBrand(price,brand);
        return updated;
    }

    @Override
    public String deleteData(Integer id) {
       String delete = repositary.deleteData(id);
        return delete;
    }

    @Override
    public List<IronEntity> getAllData() {
       List<IronEntity> list = repositary.getAllData();
       return list;
    }


}
