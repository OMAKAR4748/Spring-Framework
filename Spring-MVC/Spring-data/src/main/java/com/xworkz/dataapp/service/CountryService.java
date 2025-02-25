package com.xworkz.dataapp.service;

import com.xworkz.dataapp.dto.CountryDto;

public interface CountryService {

    boolean validateAndSave(CountryDto dto);
}
