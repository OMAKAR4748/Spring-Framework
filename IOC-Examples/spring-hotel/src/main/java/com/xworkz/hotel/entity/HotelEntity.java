package com.xworkz.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Hotel_details")
@AllArgsConstructor
@NoArgsConstructor
public class HotelEntity {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private String type;
    private Long pincode;
    private String taste;
    private double rating;

}
