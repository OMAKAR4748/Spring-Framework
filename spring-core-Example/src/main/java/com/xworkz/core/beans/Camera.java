package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Camera {
    private String brand;
    private int megapixels;
    private boolean hasZoom;

    @Autowired
    public Camera(@Value("Canon") String brand, @Value("48") int megapixels, @Value("true") boolean hasZoom) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasZoom = hasZoom;
    }
}
