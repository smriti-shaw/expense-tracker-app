package com.learnthetek.expensetracker.services.impl;

import com.learnthetek.expensetracker.VO.UserRegRequest;
import com.learnthetek.expensetracker.dao.UserDetails;
import com.learnthetek.expensetracker.model.UserDetailsDTO;
import com.learnthetek.expensetracker.repo.UserDetailsRepo;
import com.learnthetek.expensetracker.services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    UserDetailsRepo userDetailsRepo;

    @Override
    public UserDetailsDTO createRegistration(UserRegRequest userRegRequest) {
        UserDetails userDetails = new UserDetails();
        userDetails.setEmail(userRegRequest.getEmail());
        userDetails.setDateTime(LocalDateTime.now());
        UserDetails userDetails1 = userDetailsRepo.save(userDetails);
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        userDetailsDTO.setDateTime(userDetails.getDateTime());
        userDetailsDTO.setUserId(userDetails1.getUserId());
        userDetailsDTO.setUserName(userDetails1.getUserName());
        return userDetailsDTO;
    }
}
