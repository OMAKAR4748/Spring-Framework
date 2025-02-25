package com.xworkz.washingMachine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WashingMachine")
public class WashingMachineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private Integer capacity;
    private String loadType;
    private Integer spinSpeed;

}
