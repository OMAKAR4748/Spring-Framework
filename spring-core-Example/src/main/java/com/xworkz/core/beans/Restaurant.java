package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Restaurant {
    @Value("4")
    private Integer id;
    @Value("7745754444")
    private Long c_no;
    @Value("Prakshanager")
    private String location;
    @Value("Navarang")
    private String name;
    @Value("4.0")
    private Double rating;
    @Value("Veg and Non-Veg")
    private String type;
}
