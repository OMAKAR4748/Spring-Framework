package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;

public interface BagService {
    boolean validateAndSave(BagDto dto);
}
