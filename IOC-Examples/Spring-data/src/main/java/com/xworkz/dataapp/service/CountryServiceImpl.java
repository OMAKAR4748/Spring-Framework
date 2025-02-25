package com.xworkz.dataapp.service;

import com.xworkz.dataapp.dto.CountryDto;
import com.xworkz.dataapp.entity.CountryEntity;
import com.xworkz.dataapp.repositary.CountryRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepositary countryRepositary;


    @Override
    public boolean validateAndSave(CountryDto dto) {
        CountryEntity entity = new CountryEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
       boolean save = countryRepositary.save(entity);
        System.out.println("data saved");
       return save;
    }
}
