package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.Pincode;
import com.example.gtasterix.wittygreen.entity.PlantRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PlantRegRepo extends JpaRepository<PlantRegistration, Integer> {

}