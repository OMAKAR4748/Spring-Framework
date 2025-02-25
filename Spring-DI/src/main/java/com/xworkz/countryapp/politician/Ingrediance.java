package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ingrediance {
    @Value("3")
    private int noOfIngredianceUsed;
}
