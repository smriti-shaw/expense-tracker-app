package com.learnthetek.expensetracker.services.impl;

import com.learnthetek.expensetracker.dao.Expenses;
import com.learnthetek.expensetracker.model.ExpensesDTO;
import com.learnthetek.expensetracker.repo.ExpenseRepo;
import com.learnthetek.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public List<ExpensesDTO> createExpense() {

        return null;
    }

    @Override
    public List<ExpensesDTO> getAllExpenses(Integer UserId) {
//        Iterable<Expenses> expenses = expenseRepo.findAll();
//        expenses.forEach(expenses1 -> {
//            System.out.println(expenses1.getId());
//        });
        return null;
    }
}
