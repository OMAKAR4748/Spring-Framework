package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Elevator {
    int maxCapacity;
    int currentFloor;
    boolean isOperational;

    @Autowired
    public Elevator(@Value("50") int maxCapacity, @Value("4") int currentFloor, @Value("true") boolean isOperational) {
        this.maxCapacity = maxCapacity;
        this.currentFloor = currentFloor;
        this.isOperational = isOperational;
    }
}
