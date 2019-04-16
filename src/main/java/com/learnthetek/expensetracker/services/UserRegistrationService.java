package com.learnthetek.expensetracker.services;

import com.learnthetek.expensetracker.VO.UserRegRequest;
import com.learnthetek.expensetracker.model.UserDetailsDTO;

public interface UserRegistrationService {

     UserDetailsDTO createRegistration(UserRegRequest userRegRequest);
}
