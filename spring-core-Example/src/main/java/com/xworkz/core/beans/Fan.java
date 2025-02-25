package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fan {
    private String brand;
    private String type;
    private int speedSettings;
    private int currentSpeed;

    @Autowired
    public Fan(@Value("Unicon") String brand, @Value("Table Fan") String type, @Value("5") int speedSettings, @Value("6") int currentSpeed) {
        this.brand = brand;
        this.type = type;
        this.speedSettings = speedSettings;
        this.currentSpeed = currentSpeed;
    }
}
