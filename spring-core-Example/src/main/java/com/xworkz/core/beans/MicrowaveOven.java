package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MicrowaveOven {
    String brand;
    int power;
    boolean convection;

    @Autowired
    public MicrowaveOven(@Value("Sonic") String brand,@Value("1500") int power, @Value("true") boolean convection) {
        this.brand = brand;
        this.power = power;
        this.convection = convection;
    }
}
