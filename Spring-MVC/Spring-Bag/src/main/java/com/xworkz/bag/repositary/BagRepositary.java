package com.xworkz.bag.repositary;

import com.xworkz.bag.entity.BagEntity;

import java.util.List;

public interface BagRepositary {

    boolean save(BagEntity entity);

    List<BagEntity> getAllBags();

    void deleteById(int id);

    BagEntity findById(Integer id);

    boolean updateBag(BagEntity updatedBag);


}
