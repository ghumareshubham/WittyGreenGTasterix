package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.RackDetails;
import com.example.gtasterix.wittygreen.entity.TrayDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrayDetailsRepo extends JpaRepository<TrayDetails, Integer> {

}
