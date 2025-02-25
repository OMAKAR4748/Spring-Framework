package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Wife;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Husband {
    @Value("Romeo")
    private String name;
    @Value("30")
    private int age;
    @Value("6.0")
    private double height;
    @Value("65.20")
    private double weight;
    @Autowired
    private Wife wife;
}
