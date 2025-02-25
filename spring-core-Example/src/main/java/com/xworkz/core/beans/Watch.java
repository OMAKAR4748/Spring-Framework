package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Watch {

    @Value("Rolex")
    private String brand;
    @Value("yes")
    private boolean digital;
    @Value("5000.0")
    private double price;
}
