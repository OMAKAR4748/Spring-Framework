package com.xworkz.mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobileDto {

    private Integer id;
    private String brand;       // Mobile brand (e.g., Samsung, Apple)
    private String model;       // Model name (e.g., Galaxy S22, iPhone 14)
    private String os;          // Operating System (e.g., Android, iOS)
    private Integer ram;            // RAM size in GB
    private Integer storage;        // Storage capacity in GB
    private double price;       // Price of the mobile
    private Integer batteryCapacity; // Battery capacity in mAh

}
