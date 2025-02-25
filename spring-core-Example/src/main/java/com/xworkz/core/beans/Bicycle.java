package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bicycle {
    private String brand;
    private int gear;
    private double price;

    @Autowired
    public Bicycle(@Value("Giant") String brand, @Value("20") int gear,@Value("5000") double price) {
        this.brand = brand;
        this.gear = gear;
        this.price = price;
    }
}
