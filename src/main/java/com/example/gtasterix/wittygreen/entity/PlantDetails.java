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
    private Integer plantDetailsId;

    @Column(name = "plant_id", nullable = false)
    private Integer plantId;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "no_of_racks")
    private Integer noOfRacks;

    @Column(name = "no_of_blocks")
    private Integer noOfBlocks;
}

