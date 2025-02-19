package com.xworkz.dataapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Country {
    @Value("1")
    private Integer id;
    @Value("India")
    private String name;
    @Value("29")
    private Integer noOfStates;
    @Value("140000000")
    private Long population;
}
