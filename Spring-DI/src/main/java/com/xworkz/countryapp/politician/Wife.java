package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Wife {
    @Value("Juliet")
    private String name;
    @Value("29")
    private int age;
}
