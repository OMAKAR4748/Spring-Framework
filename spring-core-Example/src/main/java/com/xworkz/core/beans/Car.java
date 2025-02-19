package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Car {
    private String engineType;
    private String transmission;
    private double fuelEfficiency;
    private String safetyFeatures;

    @Autowired
    public Car(@Value("Petrol") String engineType, @Value("Automatic") String transmission,@Value("20.0") double fuelEfficiency, @Value("ESC") String safetyFeatures) {
        this.engineType = engineType;
        this.transmission = transmission;
        this.fuelEfficiency = fuelEfficiency;
        this.safetyFeatures = safetyFeatures;
    }
}
