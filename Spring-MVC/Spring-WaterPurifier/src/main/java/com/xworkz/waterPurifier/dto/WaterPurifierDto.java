package com.xworkz.waterPurifier.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterPurifierDto {

    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int capacity;
    private String filterType;
}
