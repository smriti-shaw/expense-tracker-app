package com.learnthetek.expensetracker.services.impl;

import com.learnthetek.expensetracker.VO.ExpenseRequestVO;
import com.learnthetek.expensetracker.dao.Expenses;
import com.learnthetek.expensetracker.model.ExpensesDTO;
import com.learnthetek.expensetracker.repo.ExpenseRepo;
import com.learnthetek.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public ExpensesDTO createExpense(ExpenseRequestVO expenseRequestVO) {
        Expenses expenses = new Expenses();
        expenses.setAmount(expenseRequestVO.getAmount().getAmount());
        expenses.setDateOfCreation(expenseRequestVO.getDateOfExpense());
        expenses.setAdditionalDetails(expenseRequestVO.toString());
        expenses.setUserId(expenseRequestVO.getUserId());
        System.out.println("user id coming as :"+expenseRequestVO.getUserId());

        Expenses expenses1 = expenseRepo.save(expenses);

        ExpensesDTO expensesDTO = new ExpensesDTO();
        expensesDTO.setAmount(expensesDTO.getAmount());
        expensesDTO.setExpenseName(expenseRequestVO.getExpenseName());
        expensesDTO.setId(expenses1.getId());
        return expensesDTO;
    }

    @Override
    public List<ExpensesDTO> getAllExpenses(Integer UserId) {
        List<ExpensesDTO> expensesDTOS = new LinkedList<>();
        List<Expenses> expenses ;
        expenses = expenseRepo.findAll();
        expenses.stream().forEach(expenses1 -> {
            ExpensesDTO e = new ExpensesDTO();
            e.setId(expenses1.getId());
        });
        return expensesDTOS;
    }
}
