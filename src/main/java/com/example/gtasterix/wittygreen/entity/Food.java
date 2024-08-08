package com.example.gtasterix.wittygreen.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;



@Entity
@Table(name = "food")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private int foodId;

    @Column(name = "food_name", nullable = false)
    private String foodName;

    @Column(name = "duration_to_grow", nullable = false)
    private int durationToGrow; // Duration in days or any suitable unit

    @Column(name = "expiry_after_extracted_from_plant", nullable = false)
    private int expiryAfterExtractedFromPlant; // Expiry time in days or any suitable unit
}
