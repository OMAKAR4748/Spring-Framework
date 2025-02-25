package com.xworkz.electricGuitar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricGuitarDto {
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int strings;
    private String bodyMaterial;
}
