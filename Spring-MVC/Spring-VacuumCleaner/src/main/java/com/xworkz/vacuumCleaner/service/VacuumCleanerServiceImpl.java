package com.xworkz.vacuumCleaner.service;

import com.xworkz.vacuumCleaner.dto.VacuumCleanerDto;
import com.xworkz.vacuumCleaner.entity.VacuumCleanerEntity;
import com.xworkz.vacuumCleaner.repositary.VacuumCleanerRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import java.util.List;

@Component
public class VacuumCleanerServiceImpl implements VacuumCleanerService{

    @Autowired
    VacuumCleanerRepositary repositary;

    @Override
    public boolean validateAndSave(VacuumCleanerDto dto) {
        VacuumCleanerEntity entity = new VacuumCleanerEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean save = repositary.save(entity);
        System.out.println("Data saved");
        return save;
    }

    @Override
    public Object getById(Integer id) {
        Object object = repositary.getById(id);
        return object;
    }

    @Override
    public int UpdatePriceByBrand(double price, String brand) {
        int update =repositary.UpdatePriceByBrand(price,brand);
        System.out.println("Data is updated");
        return update;
    }

    @Override
    public int UpdateModelByPrice(String model,double price) {
        int update = repositary.UpdatePriceByModel(model, price);
        return update;
    }

    @Override
    public String deleteData(Integer id) {
        String delete = repositary.deleteData(id);
        return delete;
    }

    @Override
    public List<VacuumCleanerEntity> getAllData() {

        List<VacuumCleanerEntity> list = repositary.getAllData();
        return list;
    }
}
