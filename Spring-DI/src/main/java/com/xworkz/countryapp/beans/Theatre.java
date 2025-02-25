package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Movie;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Theatre {
    @Value("2")
    private int id;
    @Value("Navarang Theatre")
    private String name;
    @Value("Navarang")
    private String location;
    @Value("200.0")
    private double ticketPrice;
    @Autowired
    private Movie movie;
}
