package com.xworkz.printer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PrinterDto {

    private Integer id;
    private String brand;
    private String model;
    private String printerType;
    private Integer resolution;

//    String brand = "HP";
//    String model = "LaserJet Pro";
//    String printerType = "Laser";
//    int resolution = 1200; // in DPI
//    boolean wireless = true;

}
