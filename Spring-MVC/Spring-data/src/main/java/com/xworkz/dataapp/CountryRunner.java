package com.xworkz.dataapp;

import com.xworkz.dataapp.config.SpringCountry;
import com.xworkz.dataapp.dto.CountryDto;
import com.xworkz.dataapp.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCountry.class);
        CountryService countryService = applicationContext.getBean(CountryService.class);


        CountryDto countryDto = new CountryDto();
        countryDto.setName("India");
        countryDto.setNoOfStates(29);
        countryDto.setPopulation(140000000L);

        countryService.validateAndSave(countryDto);


    }
}
