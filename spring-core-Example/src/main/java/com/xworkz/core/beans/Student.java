package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    @Value("Abhishek")
    private String name;
    @Value("23")
    private int age;
    @Value("Java Full-Stack Development")
    private String course;
}
