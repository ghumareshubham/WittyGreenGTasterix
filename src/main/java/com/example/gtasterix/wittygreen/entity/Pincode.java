package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Entity
@Table(name = "pincode_master")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pincode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pincode_id")
    private Integer pincodeId;

    @Column(name = "pincode", nullable = false)
    private String pincode;

    @Column(name = "area_id", nullable = false)
    private Integer areaId;
}
