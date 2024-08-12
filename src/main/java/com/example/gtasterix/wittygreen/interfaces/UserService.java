package com.example.gtasterix.wittygreen.interfaces;

import com.example.gtasterix.wittygreen.dto.BaseResponseDTO;
import com.example.gtasterix.wittygreen.dto.UserDTO;
import com.example.gtasterix.wittygreen.entity.UserRegistration;

import java.util.List;

public interface UserService {
    BaseResponseDTO createUser(UserDTO userDTO);

    List<UserRegistration> getAllUsers();
}
