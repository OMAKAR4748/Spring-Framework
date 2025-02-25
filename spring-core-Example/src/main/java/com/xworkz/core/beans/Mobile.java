package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mobile {
    private String brand;
    private String model;
    private int batteryLife;
    private boolean isPoweredOn;

    @Autowired
    public Mobile(@Value("Realmi ") String brand, @Value("Realmi") String model, @Value("5000") int batteryLife, @Value("on") boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
        this.isPoweredOn = isPoweredOn;
    }
}
