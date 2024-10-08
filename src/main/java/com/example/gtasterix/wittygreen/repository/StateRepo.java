package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.PlantRegistration;
import com.example.gtasterix.wittygreen.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

}
