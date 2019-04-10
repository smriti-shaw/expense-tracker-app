package com.learnthetek.expensetracker.controller;

import com.learnthetek.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expenses")
public class ExpenseRestController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/")
    public String getAllHotels(){
        expenseService.createExpense();
        return  "ok";
    }
}
