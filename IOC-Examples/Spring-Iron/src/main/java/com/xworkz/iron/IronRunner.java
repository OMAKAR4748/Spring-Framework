package com.xworkz.iron;

import com.xworkz.iron.config.SpringIronConfiguration;
import com.xworkz.iron.dto.IronDto;
import com.xworkz.iron.entity.IronEntity;
import com.xworkz.iron.service.IronService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class IronRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIronConfiguration.class);
       IronService service =  applicationContext.getBean(IronService.class);

        IronDto dto = new IronDto();
        dto.setBrand("Rowenta");
        dto.setModel("DW5080");
        dto.setPrice(80.0);
        dto.setPower(1700);
        dto.setSoleplateMaterial("Stainless Steel");

        service.validateAndSave(dto);

        System.out.println(service.getById(1));

        System.out.println(service.UpdatePriceByBrand(100,"Rowenta"));

        System.out.println(service.deleteData(2));

        List<IronEntity> list = service.getAllData();
        list.forEach(r-> System.out.println(r));
    }
}
