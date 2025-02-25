package com.xworkz.countryapp.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {
    @Value("The Great Gatsby")
    private String title;
    @Value("F. Scott Fitzgerald")
    private String author;
    @Value("Scribner")
    private String publisher;
    @Value("1925")
    private int publicationYear;
}
