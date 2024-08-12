package com.example.gtasterix.wittygreen.controller;


import com.example.gtasterix.wittygreen.dto.BaseResponseDTO;
import com.example.gtasterix.wittygreen.dto.ResponseDTO;
import com.example.gtasterix.wittygreen.dto.UserDTO;
import com.example.gtasterix.wittygreen.entity.UserRegistration;
import com.example.gtasterix.wittygreen.exception.BaseException;
import com.example.gtasterix.wittygreen.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;




    @PostMapping("/createUser")
    public ResponseEntity<BaseResponseDTO> createUser(@RequestBody UserDTO userDTO) {

        try {


            BaseResponseDTO response = userService.createUser(userDTO);
            return ResponseEntity.status(HttpStatus.OK).body(new BaseResponseDTO("Successful", response.getMessage()));
        } catch (BaseException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new BaseResponseDTO("Unsuccessful", e.getMessage()));
        }


    }



    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers() {

        try {
            List<UserRegistration> users = userService.getAllUsers();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO("success", users));

        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new BaseResponseDTO("unsuccess", e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new BaseResponseDTO("unsuccess", e.getMessage()));
        }

    }



}


