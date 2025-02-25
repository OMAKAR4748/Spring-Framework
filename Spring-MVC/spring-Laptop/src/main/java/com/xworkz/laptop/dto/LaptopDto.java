package com.xworkz.laptop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDto {

    private Integer id;
    private String name;
    private String color;
    private double price;
    private String processor;
    private Integer storage;
    private Integer ram;

}
