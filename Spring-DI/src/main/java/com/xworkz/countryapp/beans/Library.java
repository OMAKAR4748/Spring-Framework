package com.xworkz.countryapp.beans;

import com.xworkz.countryapp.politician.Book;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Library {
    @Value("2")
    private String libraryID;
    @Value("Angadi")
    private String libraryName;
    @Value("2nd floor opposite Auditorium ")
    private String libraryAddress;
    @Value("10.30am")
    private String openingHours;
    @Value("787554745454")
    private String contactInformation;
    @Autowired
    private Book book;



}
