package com.example.gtasterix.wittygreen.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Integer userId;
    private String name;
    private Integer plantId;
//    private LocalDateTime lastLogin;
    private Boolean isActive;
    private Boolean isFirstLogin;
    private String emailId;
    private String mobile;
    private String address;
//    private LocalDateTime createdDtm;

}
