package com.example.gtasterix.wittygreen.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Table(name = "track_planting")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrackPlanting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tray_id")
    private Integer trayId;

    @Column(name = "food_id", nullable = false)
    private Integer foodId;

    @Column(name = "plant_date")
    private LocalDateTime plantDate;

    @Column(name = "created_dtm", nullable = false)
    private LocalDateTime createdDtm;
}


