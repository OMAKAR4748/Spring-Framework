package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.SimCard;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mobile {

    @Value("1")
    private int id;
    @Value("Redmi")
    private String name;
    @Value("M2006C3LII")
    private String model;
    @Value("8000.0")
    private double price;
    @Value("Grey")
    private String color;
    @Autowired
    private SimCard simCard;
}
