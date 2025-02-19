package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Movie {
    @Value("Yodhaa")
    private String movieName;
    @Value("15-08-20024")
    private String releasedDate;
}
