package com.xworkz.washingMachine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WashingMachineDto {
    private Integer id;
    private String brand;
    private Integer capacity;
    private String loadType;
    private Integer spinSpeed;
}
