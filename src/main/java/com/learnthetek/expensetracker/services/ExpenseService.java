package com.learnthetek.expensetracker.services;

import com.learnthetek.expensetracker.model.ExpensesDTO;

import java.util.List;

public interface ExpenseService {

     List<ExpensesDTO> createExpense();

     List<ExpensesDTO> getAllExpenses(Integer UserId);
}
