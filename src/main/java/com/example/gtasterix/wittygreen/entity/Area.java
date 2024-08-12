package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;



@Entity
@Table(name = "area_master")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "city_id", nullable = false)
    private Integer cityId;
}
