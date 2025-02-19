package com.xworkz.washingMachine;

import com.xworkz.washingMachine.config.SpringWashingMachineConfiguration;
import com.xworkz.washingMachine.dto.WashingMachineDto;
import com.xworkz.washingMachine.service.WashingMachineService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WashingMachineRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringWashingMachineConfiguration.class);
        WashingMachineService  service = applicationContext.getBean(WashingMachineService.class);

        WashingMachineDto dto = new WashingMachineDto();
        dto.setBrand("LG");
        dto.setCapacity(8);
        dto.setLoadType("Front Load");
        dto.setSpinSpeed(1400);

        service.validateAndSave(dto);


    }
}
