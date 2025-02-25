package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Politician {

    @Value("1")
    private int id;
    @Value("Narendra Modi")    //dependency initialization
    private String name;
}

