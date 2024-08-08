package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.Pincode;
import com.example.gtasterix.wittygreen.entity.PlantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlantDetailsRepo extends JpaRepository<PlantDetails, Integer> {

}