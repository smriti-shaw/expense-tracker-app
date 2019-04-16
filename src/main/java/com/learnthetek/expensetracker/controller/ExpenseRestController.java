package com.learnthetek.expensetracker.controller;

import com.learnthetek.expensetracker.VO.ExpenseRequestVO;
import com.learnthetek.expensetracker.model.ExpensesDTO;
import com.learnthetek.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/expenses")
@CrossOrigin("http://localhost:63342")
public class ExpenseRestController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/")
    public String getAllHotels(){
//        expenseService.createExpense();
        return  "ok";
    }

    @PostMapping("/expenses")
    public ResponseEntity<List<ExpensesDTO>> createExpenses(@RequestBody  List<ExpenseRequestVO> expenses){
        List<ExpensesDTO> expensesDTOS = null;
        return new ResponseEntity<>(expensesDTOS, HttpStatus.OK);
    }

    @PostMapping("/expense")
    @ResponseBody
    public ResponseEntity<ExpensesDTO> createExpense(@RequestBody  ExpenseRequestVO expense){
        ExpensesDTO expensesDTO = expenseService.createExpense(expense);
        return new ResponseEntity<>(expensesDTO, HttpStatus.OK);
    }




}
