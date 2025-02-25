package com.xworkz.hotel.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelDto {
    private Integer id;
    private String name;
    private String location;
    private String type;
    private Long pincode;
    private String taste;
    private double rating;
}
