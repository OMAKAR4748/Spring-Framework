package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fridge {
    private String brand;
    private int capacity;
    private double temperature;
    private boolean isDoorOpen;

    @Autowired
    public Fridge(@Value("Sumsung") String brand, @Value("300") int capacity, @Value("5.0") double temperature,@Value("true") boolean isDoorOpen) {
        this.brand = brand;
        this.capacity = capacity;
        this.temperature = temperature;
        this.isDoorOpen = isDoorOpen;
    }
}
