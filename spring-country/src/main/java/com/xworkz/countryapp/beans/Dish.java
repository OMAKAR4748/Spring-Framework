package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Ingrediance;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dish {
    @Value("Poha")
    private String name;
    @Value("30")
    private double price;
    @Value("true")
    private boolean vegetarian;
    @Autowired
    private Ingrediance ingrediance;
}
