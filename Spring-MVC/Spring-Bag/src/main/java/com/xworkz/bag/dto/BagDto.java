package com.xworkz.bag.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BagDto {
    private Integer id;
    private String brand;
    private String color;
    private Integer capacity;
    private Integer price;
}
