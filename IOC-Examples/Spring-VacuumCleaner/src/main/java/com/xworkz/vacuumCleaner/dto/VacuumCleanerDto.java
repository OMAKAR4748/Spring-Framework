package com.xworkz.vacuumCleaner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacuumCleanerDto {
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int power;
    private String filterType;
}
