package com.xworkz.electricGuitar;

import com.xworkz.electricGuitar.config.SpringElectricGuitarConfiguration;
import com.xworkz.electricGuitar.dto.ElectricGuitarDto;
import com.xworkz.electricGuitar.service.ElectricGuitarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ElectricGuitarRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringElectricGuitarConfiguration.class);
        ElectricGuitarService electricGuitarService = applicationContext.getBean(ElectricGuitarService.class);

        ElectricGuitarDto electricGuitarDto = new ElectricGuitarDto();
        electricGuitarDto.setBrand("Fender");
        electricGuitarDto.setModel("Stratocaster");
        electricGuitarDto.setPrice(1200.0);
        electricGuitarDto.setStrings(6);
        electricGuitarDto.setBodyMaterial("Alder");

        electricGuitarService.validateAndSave(electricGuitarDto);

        System.out.println(electricGuitarService.getById(2));

        System.out.println(electricGuitarService.getModelByBodyMaterial("HP","Alder"));
    }
}
