package com.xworkz.laptop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Laptop_Details")
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private double price;
    @Column(name = "processor")
    private String processor;
    @Column(name = "storage")
    private Integer storage;
    @Column(name = "ram")
    private Integer ram;
}
