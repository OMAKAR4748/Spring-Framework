package com.xworkz.dataapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {
    private Integer id;
    private String name;
    private Integer noOfStates;
    private Long population;
}
