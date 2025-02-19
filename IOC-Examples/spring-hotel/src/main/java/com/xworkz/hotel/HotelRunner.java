package com.xworkz.hotel;

import com.xworkz.hotel.config.SpringHotel;
import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.service.HotelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHotel.class);
        HotelService service = applicationContext.getBean(HotelService.class);

        HotelDto dto =  new HotelDto();
        dto.setName("Savali");
        dto.setLocation("Jamboti");
        dto.setTaste("Good");
        dto.setRating(4.0);
        dto.setType("Veg And Non-Veg");
        dto.setPincode(591345L);

        service.validateAndSave(dto);

    }
}
