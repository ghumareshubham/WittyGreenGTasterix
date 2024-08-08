package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.RackDetails;
import com.example.gtasterix.wittygreen.entity.TrackPlanting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrackPlantingRepo extends JpaRepository<TrackPlanting, Integer> {

}
