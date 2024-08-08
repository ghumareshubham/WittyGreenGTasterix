package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Entity
@Table(name = "plant_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_details_id")
    private int plantDetailsId;

    @Column(name = "plant_id", nullable = false)
    private int plantId;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "no_of_racks")
    private int noOfRacks;

    @Column(name = "no_of_blocks")
    private int noOfBlocks;
}

