package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private String name;
    private String brand;
    private String color;
    private String processor;
    private Integer storage;
    private Integer ram;

    @Autowired
    public Laptop(@Value("HP") String name, @Value("HP") String brand, @Value("black") String color, @Value("HP") String processor, @Value("512") Integer storage, @Value("8") Integer ram) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.processor = processor;
        this.storage = storage;
        this.ram = ram;
    }
}
