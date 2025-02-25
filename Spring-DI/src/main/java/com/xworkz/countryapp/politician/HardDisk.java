package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class HardDisk {
    @Value("8GB")
    private String ram;
    @Value("512")
    private int storage;
    @Value("100000.0")
    private double speed;
}
