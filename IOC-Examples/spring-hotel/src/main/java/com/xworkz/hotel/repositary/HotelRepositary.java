package com.xworkz.hotel.repositary;


import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.entity.HotelEntity;

public interface HotelRepositary {
    boolean save(HotelEntity entity);
}
