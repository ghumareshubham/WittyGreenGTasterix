package com.example.gtasterix.wittygreen.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseException extends RuntimeException {
    private String code;

    private String message;

}
