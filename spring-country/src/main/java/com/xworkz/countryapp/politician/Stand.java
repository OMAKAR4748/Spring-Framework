package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Stand {

    @Value("Metal")
    private String Material;
    @Value("Modern")
    private String style;

}
