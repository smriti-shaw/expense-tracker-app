package com.learnthetek.expensetracker.controller;

import com.learnthetek.expensetracker.VO.UserRegRequest;
import com.learnthetek.expensetracker.model.UserDetailsDTO;
import com.learnthetek.expensetracker.services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    UserRegistrationService registrationService;

    @PostMapping("/reg")
    public ResponseEntity<UserDetailsDTO> createRegistration(@RequestBody UserRegRequest input){

        UserDetailsDTO userDetailsDTO = registrationService.createRegistration(input);

        return new ResponseEntity<>(userDetailsDTO, HttpStatus.OK);
    }


}
