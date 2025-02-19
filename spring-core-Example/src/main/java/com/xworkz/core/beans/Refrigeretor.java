package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Refrigeretor {

   @Value("Sumsung")
   private String brand;
   @Value("5000")
   private int capacity;
   @Value("true")
   private boolean doubleDoor;
}
