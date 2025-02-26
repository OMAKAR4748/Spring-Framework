package com.xworkz.bag.repository;

import com.xworkz.bag.entity.BagEntity;
import java.util.List;
import java.util.Optional;

public interface BagRepository {

    // Save a new bag entry
    boolean save(BagEntity entity);

    // Retrieve all bags
    List<BagEntity> getAllBags();

    // Delete a bag by ID
    String deleteBagById(Integer id);

    // Update an existing bag
    void updateBag(BagEntity updatedBag);

    // Update bag details by ID
    Optional<BagEntity> updateBagById(int id, String brand, String color, Integer capacity, Integer price);
}
