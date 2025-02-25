package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TV {

    @Value("Sony")
    private String brand;
    @Value("40")
    private double screenSize;
    @Value("5k")
    private String resolution;
    @Value("on")
    private boolean isOn;
    @Value("400")
    private int currentChannel;
    @Value("70")
    private int volumeLevel;
}
