package com.xworkz.vacuumCleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VacuumCleaner")
@NamedQuery(name = "getAllData",query = "select u from VacuumCleanerEntity u")
@NamedQuery(name = "getById",query = "select u from VacuumCleanerEntity u where u.id =:id")
@NamedQuery(name = "UpdatePriceByBrand",query = "update VacuumCleanerEntity a set a.price=:price where a.brand=:brand")
@NamedQuery(name = "deleteData",query = "delete from VacuumCleanerEntity u where u.id =:id")
@NamedQuery(name = "UpdateModelByPrice",query = "update VacuumCleanerEntity a set a.model =:model where a.price=:price")

public class VacuumCleanerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int power;
    private String filterType;
}
