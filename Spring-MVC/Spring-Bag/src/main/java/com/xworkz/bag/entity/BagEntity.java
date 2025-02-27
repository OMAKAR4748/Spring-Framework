package com.xworkz.bag.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Bag")

@NamedQuery(name = "getAllBags",query = "select u from BagEntity u")
@NamedQuery(name="deleteBag", query = "Delete From BagEntity where id = :id")
@NamedQuery(name = "findById", query = "select u From BagEntity u where u.id = :id")
public class BagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String color;
    private Integer capacity;
    private Integer price;
}
