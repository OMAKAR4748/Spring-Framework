package com.xworkz.waterPurifier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WaterPurifier")
@NamedQuery(name = "getAllData",query = "select a from WaterPurifierEntity a")
@NamedQuery(name = "getById",query = "select a from WaterPurifierEntity a where a.id=:id")
@NamedQuery(name = "updateIdByPrice",query = "Update WaterPurifierEntity a set a.id=:id where a.price=:price")
public class WaterPurifierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int capacity;
    private String filterType;
}
