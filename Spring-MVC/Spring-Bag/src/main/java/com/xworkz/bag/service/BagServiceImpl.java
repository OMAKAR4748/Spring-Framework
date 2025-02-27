package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.repositary.BagRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BagServiceImpl implements BagService {

    @Autowired
    private BagRepositary bagRepositary;

    @Override
    public boolean addBag(BagDto dto) {
        BagEntity entity = new BagEntity();

        entity.setBrand(dto.getBrand());
        entity.setColor(dto.getColor());
        entity.setCapacity(dto.getCapacity());
        entity.setPrice(dto.getPrice());
        bagRepositary.save(entity);

        return true;
    }

    @Override
    public List<BagDto> getAllBags() {
        List<BagDto> dtos = new ArrayList<>();
        List<BagEntity> entities = bagRepositary.getAllBags();
        for (BagEntity entity : entities) {
            BagDto dto = new BagDto();
            BeanUtils.copyProperties(entity, dto);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public void deleteById(int id) {
        bagRepositary.deleteById(id);

    }

    @Override
    public BagEntity findById(Integer id) {
       return bagRepositary.findById(id);
    }

    @Override
    public boolean updateBag(BagDto bagDto) {
        BagEntity entity = new BagEntity();
        BeanUtils.copyProperties(bagDto,entity);

        bagRepositary.updateBag(entity);
        return true;
    }


}
