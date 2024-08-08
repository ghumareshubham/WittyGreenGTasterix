package com.example.gtasterix.wittygreen.repository;


import com.example.gtasterix.wittygreen.entity.BlockDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockdetailsRepo extends JpaRepository<BlockDetails , Integer> {

}
