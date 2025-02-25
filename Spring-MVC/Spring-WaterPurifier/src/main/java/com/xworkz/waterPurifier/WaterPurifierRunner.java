package com.xworkz.waterPurifier;

import com.xworkz.waterPurifier.config.SpringWaterPurifierConfiguration;
import com.xworkz.waterPurifier.dto.WaterPurifierDto;
import com.xworkz.waterPurifier.entity.WaterPurifierEntity;
import com.xworkz.waterPurifier.service.WaterPurifierService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class WaterPurifierRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringWaterPurifierConfiguration.class);
        WaterPurifierService waterPurifierService = applicationContext.getBean(WaterPurifierService.class);

        WaterPurifierDto waterPurifierDto = new WaterPurifierDto();
        waterPurifierDto.setBrand("Kent");
        waterPurifierDto.setModel("Grand Plus");
        waterPurifierDto.setPrice(250.0);
        waterPurifierDto.setCapacity(8);
        waterPurifierDto.setFilterType("RO+UV+UF");

//        waterPurifierService.validateAndSave(waterPurifierDto);

        List<WaterPurifierEntity> list = waterPurifierService.getAllData();
        list.forEach(a -> System.out.println(a));

        System.out.println(waterPurifierService.getById(1));

        System.out.println(waterPurifierService.updateIdByPrice(2,300));


    }
}
