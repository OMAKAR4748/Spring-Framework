package com.xworkz.laptopDetails.service;

import com.xworkz.laptopDetails.dto.LaptopDto;
import com.xworkz.laptopDetails.entity.LaptopEntity;
import com.xworkz.laptopDetails.repository.LaptopRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopServiceImpl implements LaptopService{
    @Autowired
    LaptopRepo laptopRepo;
    @Override
    public void validandSave(LaptopDto laptopDto) {

        LaptopEntity laptopEntity=new LaptopEntity();
        BeanUtils.copyProperties(laptopDto,laptopEntity);
        laptopRepo.save(laptopEntity);


    }
}
