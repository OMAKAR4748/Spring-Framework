package com.xworkz.vacuumCleaner;

import com.xworkz.vacuumCleaner.config.SpringVacuumCleanerConfiguration;
import com.xworkz.vacuumCleaner.dto.VacuumCleanerDto;
import com.xworkz.vacuumCleaner.entity.VacuumCleanerEntity;
import com.xworkz.vacuumCleaner.service.VacuumCleanerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringVacuumCleanerConfiguration.class);
        VacuumCleanerService service = applicationContext.getBean(VacuumCleanerService.class);

        VacuumCleanerDto vacuumCleanerDto = new VacuumCleanerDto();
        vacuumCleanerDto.setBrand("SamSung");
        vacuumCleanerDto.setModel("V11");
        vacuumCleanerDto.setPrice(600.0);
        vacuumCleanerDto.setPower(185);
        vacuumCleanerDto.setFilterType("HEPA");

        service.validateAndSave(vacuumCleanerDto);

        System.out.println(service.getById(1));

        System.out.println(service.UpdatePriceByBrand(550,"SamSung"));

        System.out.println(service.deleteData(6));

        List<VacuumCleanerEntity> list = service.getAllData();
        list.forEach(u -> System.out.println(u));

        System.out.println(service.UpdateModelByPrice("HP",5000));



    }
}
