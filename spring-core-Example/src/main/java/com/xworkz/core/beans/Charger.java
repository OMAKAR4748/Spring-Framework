package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Charger {
    private String brand;
    private String type;
    private double outputPower;
    private boolean isConnected;

    @Autowired
    public Charger(@Value("Redmi") String brand, @Value("USB-C") String type, @Value("24.0") double outputPower, @Value("On") boolean isConnected) {
        this.brand = brand;
        this.type = type;
        this.outputPower = outputPower;
        this.isConnected = isConnected;
    }
}
