package com.xworkz.mobile;

import com.xworkz.mobile.config.SpringMobile;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.service.MobileService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringMobile.class);
        MobileService mobileService = applicationContext.getBean(MobileService.class);

        MobileDto mobileDto = new MobileDto();
//        mobileDto.setId(1);
        mobileDto.setBrand("Samsung");
        mobileDto.setModel("Galaxy S22");
        mobileDto.setOs("Android");
        mobileDto.setRam(4);
        mobileDto.setPrice(15000);
        mobileDto.setStorage(128);
        mobileDto.setBatteryCapacity(4500);

        mobileService.validateAndSave(mobileDto);

    }
}
