package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pg {

    @Value("2")
    private Integer id;
    @Value("Annapurna PG")
    private String name;
    @Value("8977446754")
    private Long phone;
    @Value("2")
    private String room_type;

    @Autowired
    public Pg(@Value("5") Integer id, @Value("Srinivas") String name, @Value("8745457245454545") Long phone, @Value("3") String room_type) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.room_type = room_type;
    }
}
