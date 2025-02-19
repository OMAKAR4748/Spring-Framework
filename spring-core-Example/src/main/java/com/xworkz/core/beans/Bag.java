package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bag {
    private String brand;
    private String color;
    private int capacity;
    private boolean isOpen;

    @Autowired
    public Bag(@Value("Lenovo") String brand,@Value("Gray") String color,@Value("1500") int capacity,@Value("true") boolean isOpen) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.isOpen = isOpen;
    }
}
