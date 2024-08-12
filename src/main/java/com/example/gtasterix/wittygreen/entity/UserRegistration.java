package com.example.gtasterix.wittygreen.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "master_user_registration")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegistration {



    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "user_id",updatable = false, nullable = false, unique = true)
    private UUID userId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "plant_id", nullable = false)
    private Integer plantId;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "is_first_login", nullable = false)
    private Boolean isFirstLogin;

    @Column(name = "email_id", unique = true, nullable = false)
    private String emailId;

    @Column(name = "mobile", unique = true, nullable = false)
    private String mobile;

    @Column(name = "address")
    private String address;

    @Column(name = "created_dtm", nullable = false)
    private LocalDateTime createdDtm;
}
