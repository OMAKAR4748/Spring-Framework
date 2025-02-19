package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Address;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Patient {
    @Value("1")
    private int id;
    @Value("Suresh")
    private String name;
    @Value("30")
    private int age;
    @Autowired
    private Address address;
}
