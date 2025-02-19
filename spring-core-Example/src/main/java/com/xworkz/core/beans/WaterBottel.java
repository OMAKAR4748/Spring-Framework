package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WaterBottel {

    @Value("Milton")
    private String brand;
    @Value("1500")
    private int capacity;
    @Value("yes")
    private boolean isInsulated;
}
