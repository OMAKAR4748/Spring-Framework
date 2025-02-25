package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Room;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class House {
    @Value("1")
    private int id;
    @Value("Deekshit")
    private String houseOwnerName;
    @Value("420")
    private int houseNumber;
    @Value("PrakashNager")
    private String location;
    @Autowired
    private Room rooms;
}
