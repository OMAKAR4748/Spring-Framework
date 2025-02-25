package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MusicPlayer {

    @Value("Spotify")
    private String brand;
    @Value("200")
    private int storage;
    @Value("true")
    private boolean supportsBluetooth;
}
