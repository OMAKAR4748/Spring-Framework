package com.xworkz.mobile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Mobile_details")
public class MobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "brand")
    private String brand;       // Mobile brand (e.g., Samsung, Apple)
    @Column(name = "model")
    private String model;       // Model name (e.g., Galaxy S22, iPhone 14)
    @Column(name = "os")
    private String os;          // Operating System (e.g., Android, iOS)
    @Column(name = "ram")
    private Integer ram;            // RAM size in GB
    @Column(name = "storage")
    private Integer storage;        // Storage capacity in GB
    @Column(name = "price")
    private double price;       // Price of the mobile
    @Column(name = "batteryCapacity")
    private Integer batteryCapacity; // Battery capacity in mAh
}
