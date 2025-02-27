package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.entity.BagEntity;
import java.util.List;
import java.util.Optional;

public interface BagService {

    boolean addBag(BagDto dto);

    List<BagDto> getAllBags();

    void deleteById(int id);

    BagEntity findById(Integer id);

    boolean updateBag(BagDto bagDto);
}
