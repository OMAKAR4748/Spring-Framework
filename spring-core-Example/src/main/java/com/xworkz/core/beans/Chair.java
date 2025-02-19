package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Chair {
    private String material;
    private String color;
    private double height;
    private boolean isOccupied;

    @Autowired
    public Chair(@Value("Fiber") String material, @Value("Blue") String color, @Value("90") double height, @Value("true") boolean isOccupied) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.isOccupied = isOccupied;
    }
}
