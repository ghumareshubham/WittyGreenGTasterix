package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.PlantDetails;
import com.example.gtasterix.wittygreen.entity.RackDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RackDetailsRepo extends JpaRepository<RackDetails, Integer> {

}
