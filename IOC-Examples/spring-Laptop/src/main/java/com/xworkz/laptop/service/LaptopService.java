package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopService {

    boolean validateAndSave(LaptopDto dto);
}
