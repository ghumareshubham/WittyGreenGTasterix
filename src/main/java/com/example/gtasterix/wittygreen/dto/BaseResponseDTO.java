package com.example.gtasterix.wittygreen.dto;

import lombok.Data;

@Data
public class BaseResponseDTO {
    private String code;

    private String message;

    public BaseResponseDTO(String successful, String message) {
    }

    public BaseResponseDTO() {

    }
}
