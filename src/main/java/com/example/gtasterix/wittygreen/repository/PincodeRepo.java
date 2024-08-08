package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.Area;
import com.example.gtasterix.wittygreen.entity.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PincodeRepo extends JpaRepository<Pincode, Integer> {

}