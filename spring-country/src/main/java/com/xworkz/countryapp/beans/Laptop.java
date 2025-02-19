package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.HardDisk;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    @Value("1")
    private int id;
    @Value("Lenovo")
    private String name;
    @Value("Black")
    private String color;
    @Value("40000.0")
    private double price;
    @Autowired
    private HardDisk hardDisk;
}
