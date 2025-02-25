package com.xworkz.laptopDetails.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "laptop_info")
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String modelName;
    private Integer price;
}
