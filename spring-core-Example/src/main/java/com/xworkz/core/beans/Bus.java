package com.xworkz.core.beans;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bus {
    private String routeNumber;
    private int capacity;
    private int currentPassengers;
    private boolean isOperational;

    @Autowired
    public Bus(@Value("340B") String routeNumber,@Value("80") int capacity, @Value("40") int currentPassengers, @Value("true") boolean isOperational) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.currentPassengers = currentPassengers;
        this.isOperational = isOperational;
    }
}
