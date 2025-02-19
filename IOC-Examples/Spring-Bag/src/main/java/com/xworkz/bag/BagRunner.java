package com.xworkz.bag;

import com.xworkz.bag.config.SpringBagConfiguration;
import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.service.BagService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBagConfiguration.class);
        BagService service = applicationContext.getBean(BagService.class);

        BagDto dto = new BagDto();
        dto.setBrand("SkyBag");
        dto.setColor("black");
        dto.setCapacity(1000);
        dto.setPrice(500);

        service.validateAndSave(dto);

    }
}
