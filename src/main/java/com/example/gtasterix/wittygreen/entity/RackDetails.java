package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Entity
@Table(name = "rack_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RackDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rack_id")
    private int rackId;

    @Column(name = "rack_identity", nullable = false, unique = true)
    private String rackIdentity;

    @Column(name = "rack_width", nullable = false)
    private double rackWidth;

    @Column(name = "height", nullable = false)
    private double height;
}
