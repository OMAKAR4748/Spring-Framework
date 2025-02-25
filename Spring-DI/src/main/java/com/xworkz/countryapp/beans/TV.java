package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Stand;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TV {
    @Value("4")
    private int id;
    @Value("Sony")
    private String name;
    @Value("70 inches")
    private String screenSize;
    @Value("LCD")
    private String Display;
    @Value("1080p")
    private String Resolution;
    @Autowired
    private Stand stand;

}
