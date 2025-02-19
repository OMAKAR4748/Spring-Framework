package com.xworkz.iron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IronDto {
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private Integer power;
    private String soleplateMaterial;
}
