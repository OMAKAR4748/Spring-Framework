package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AirConditioner {
    private String brand;
    private int ton;
    private boolean inverter;

    @Autowired
    public AirConditioner(@Value("BlueStar") String brand, @Value("2") int ton, @Value("true") boolean inverter) {
        this.brand = brand;
        this.ton = ton;
        this.inverter = inverter;
    }
}
