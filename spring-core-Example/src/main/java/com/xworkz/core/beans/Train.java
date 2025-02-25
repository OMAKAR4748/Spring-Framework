package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Train {

    @Value("Rani Channamma Express")
    private String name;
    @Value("3000")
    private int capacity;
    @Value("true")
    private boolean isExpress;


}
