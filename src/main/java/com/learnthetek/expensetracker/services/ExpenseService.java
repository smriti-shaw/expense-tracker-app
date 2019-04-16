package com.learnthetek.expensetracker.services;

import com.learnthetek.expensetracker.VO.ExpenseRequestVO;
import com.learnthetek.expensetracker.model.ExpensesDTO;

import java.util.List;

public interface ExpenseService {

     ExpensesDTO createExpense(ExpenseRequestVO expenseRequestVO);

     List<ExpensesDTO> getAllExpenses(Integer UserId);
}
