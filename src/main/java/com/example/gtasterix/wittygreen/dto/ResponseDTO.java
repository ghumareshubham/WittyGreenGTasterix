package com.example.gtasterix.wittygreen.dto;


import lombok.Data;

@Data
public class ResponseDTO {

    public String message;
    public Object object;


    public ResponseDTO(String message, Object object) {
        this.message = message;
        this.object = object;
    }
}
