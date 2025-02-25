package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class House {
    String location;
    int rooms;
    boolean hasGarden;

    @Autowired
    public House(@Value("Belagavi") String location, @Value("5") int rooms, @Value("true") boolean hasGarden) {
        this.location = location;
        this.rooms = rooms;
        this.hasGarden = hasGarden;
    }
}
