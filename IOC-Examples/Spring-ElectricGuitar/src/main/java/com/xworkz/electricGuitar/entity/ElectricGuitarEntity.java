package com.xworkz.electricGuitar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ElectricGuitar")
@NamedQuery(name = "getById",query = "select a from ElectricGuitarEntity a where a.id=:id")
@NamedQuery(name = "UpdateModelByBodyMaterial",query = "update ElectricGuitarEntity a set a.model=:model where a.bodyMaterial=:bodyMaterial")
public class ElectricGuitarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int strings;
    private String bodyMaterial;
}
