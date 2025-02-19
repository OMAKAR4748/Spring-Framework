package com.xworkz.iron.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Iron")
@NamedQuery(name = "getById",query = "select u from IronEntity u where u.id=:id")
@NamedQuery(name = "UpdatePriceByBrand",query = "update IronEntity a set a.price=:price where a.brand=:brand")
@NamedQuery(name = "deleteData",query = "delete from IronEntity u where u.id =:id")
@NamedQuery(name = "getAllData",query = "select u from IronEntity u")

public class IronEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private Integer power;
    private String soleplateMaterial;
}
