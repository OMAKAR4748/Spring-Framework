package com.xworkz.laptop;

import com.xworkz.laptop.config.SpringLaptop;
import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLaptop.class);
        LaptopService laptopService = applicationContext.getBean(LaptopService.class);

        LaptopDto dto = new LaptopDto();
//        dto.setId(1);
        dto.setName("Lenovo");
        dto.setColor("Gray");
        dto.setPrice(40000.0);
        dto.setProcessor("Intel i7");
        dto.setRam(8);
        dto.setStorage(512);

        laptopService.validateAndSave(dto);
    }
}
