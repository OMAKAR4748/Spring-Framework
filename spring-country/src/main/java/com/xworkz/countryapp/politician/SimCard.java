package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class SimCard {
    @Value("1")
    private int id;
    @Value("Jio")
    private String simCard;
}
