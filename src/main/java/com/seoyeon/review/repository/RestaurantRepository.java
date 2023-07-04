package com.seoyeon.review.repository;

import com.seoyeon.review.model.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository <RestaurantEntity, Long> {
}
