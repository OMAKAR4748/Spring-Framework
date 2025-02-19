package com.xworkz.core.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Stand {
    private int id;
    private String brandName;
    private double price;

    @Autowired
    public Stand( @Value ("1") int id, @Value("Onida") String brandName, @Value("230") double price) {
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }
}
