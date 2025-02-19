package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WatchDto {

    private  Integer id;
    private String brand;
    private String color;
    private double price;
}
