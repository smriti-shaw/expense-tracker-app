package com.learnthetek.expensetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class Health {

    @GetMapping("/")
    public String getAllHotels(){
        System.out.println("request here");
        return  "ok";
    }


}
