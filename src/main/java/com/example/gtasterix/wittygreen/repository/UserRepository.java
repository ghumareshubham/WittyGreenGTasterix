package com.example.gtasterix.wittygreen.repository;

import com.example.gtasterix.wittygreen.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserRegistration, Integer> {


//    Optional<User> findByReferenceId(String randomReferenceNumber);
//
//    User findByEmail(String email);


}