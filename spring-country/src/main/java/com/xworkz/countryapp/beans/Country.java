package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Politician;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Country {

    @Value("1")
    private int id;
    @Value("India")
    private String name;
    @Value("29")
    private int noOfStates;
    @Value("140000000")
    private long population;
    @Autowired
    private Politician politician;
}
