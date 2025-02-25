package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {
    boolean validateAndSave(HotelDto dto);
}
