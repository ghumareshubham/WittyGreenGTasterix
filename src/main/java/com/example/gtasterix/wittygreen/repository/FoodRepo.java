package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.BlockDetails;
import com.example.gtasterix.wittygreen.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {

}
