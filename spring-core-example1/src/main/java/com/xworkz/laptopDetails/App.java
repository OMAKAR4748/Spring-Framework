package com.xworkz.laptopDetails;

import com.xworkz.laptopDetails.config.springConfig;
import com.xworkz.laptopDetails.dto.LaptopDto;
import com.xworkz.laptopDetails.service.LaptopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(springConfig.class);
       LaptopService laptopService= applicationContext.getBean(LaptopService.class);
        LaptopDto laptopDto=new LaptopDto();
        laptopDto.setName("Asus vivobook");
        laptopDto.setModelName("vivobook");
        laptopDto.setPrice(52000);
        laptopService.validandSave(laptopDto);
    }
}
