package com.example.gtasterix.wittygreen.serviceImpl;

import com.example.gtasterix.wittygreen.dto.BaseResponseDTO;
import com.example.gtasterix.wittygreen.dto.UserDTO;
import com.example.gtasterix.wittygreen.entity.UserRegistration;
import com.example.gtasterix.wittygreen.exception.BaseException;
import com.example.gtasterix.wittygreen.interfaces.UserService;
import com.example.gtasterix.wittygreen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public BaseResponseDTO createUser(UserDTO userDTO) {

BaseResponseDTO baseResponseDTO= new BaseResponseDTO();
        UserRegistration userRegistration = UserRegistration.builder()
//                .userId(userDTO.getUserId())           // If userId is to be set explicitly, otherwise remove this line.
                .name(userDTO.getName())
                .plantId(userDTO.getPlantId())
                .isActive(userDTO.getIsActive())
                .isFirstLogin(userDTO.getIsFirstLogin())
                .emailId(userDTO.getEmailId())
                .mobile(userDTO.getMobile())
                .address(userDTO.getAddress())
                .build();


        userRegistration.setCreatedDtm(LocalDateTime.now());
//        userRegistration.setLastLogin();

        try {
            userRepository.save(userRegistration);
            baseResponseDTO.setMessage("User saved Successfully....");
            baseResponseDTO.setCode(String.valueOf(HttpStatus.OK.value()));
        } catch (BaseException e) {

            baseResponseDTO.setMessage("Error while saving user....");
            baseResponseDTO.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
        }
        return baseResponseDTO;

    }

    @Override
    public List<UserRegistration> getAllUsers() {

        return userRepository.findAll();
    }






}
