package com.example.gtasterix.wittygreen.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;
@Entity
@Table(name = "plant_registration")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlantRegistration {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name = "plant_name", nullable = false)
    private String plantName;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "area")
    private String area;

    @Column(name = "pincode", nullable = false)
    private String pincode;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "created_dtm", nullable = false)
    private LocalDateTime createdDtm;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

//    // Password encryption logic (assumes you handle this elsewhere)
//    @Transient // Exclude from persistence
//    private String password;
//
//    public void setPassword(String password) {
//        this.password = encryptPassword(password); // Implement encryption logic
//    }
//
//    private String encryptPassword(String password) {
//        // Implement encryption here (e.g., using BCrypt or another method)
//        return password; // Replace with actual encryption logic
//    }
}
