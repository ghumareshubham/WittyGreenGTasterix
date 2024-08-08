package com.example.gtasterix.wittygreen.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Table(name = "master_user_registration")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegistration {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "plant_id", nullable = false)
    private int plantId;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "is_first_login", nullable = false)
    private boolean isFirstLogin;

    @Column(name = "email_id", unique = true, nullable = false)
    private String emailId;

    @Column(name = "mobile", unique = true, nullable = false)
    private String mobile;

    @Column(name = "address")
    private String address;

    @Column(name = "created_dtm", nullable = false)
    private LocalDateTime createdDtm;
}
