package com.xworkz.watch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "watch_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String brand;
    private String color;
    private double price;
}
