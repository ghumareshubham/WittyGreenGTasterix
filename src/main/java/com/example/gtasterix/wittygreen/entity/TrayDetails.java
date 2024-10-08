package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Entity
@Table(name = "tray_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrayDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tray_id")
    private Integer trayId;

    @Column(name = "tray_identity", nullable = false, unique = true)
    private String trayIdentity;

    @Column(name = "block_id", nullable = false)
    private Integer blockId;

    @Column(name = "width", nullable = false)
    private Double width;

    @Column(name = "height", nullable = false)
    private Double height;




//    // Optional: If you want to set up a relationship with Block entity
//    @ManyToOne
//    @JoinColumn(name = "block_id", insertable = false, updatable = false)
//    private BlockDetails block;


}
