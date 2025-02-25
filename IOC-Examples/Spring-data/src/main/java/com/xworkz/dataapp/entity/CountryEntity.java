package com.xworkz.dataapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.*;


@Data
@Entity
@Table(name = "Country_Details")
@NoArgsConstructor
@AllArgsConstructor
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "noOfStates")
    private Integer noOfStates;
    @Column(name = "population")
    private Long population;
}

