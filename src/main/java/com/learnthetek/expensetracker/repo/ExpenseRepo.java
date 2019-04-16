package com.learnthetek.expensetracker.repo;

import com.learnthetek.expensetracker.dao.Expenses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepo extends CrudRepository<Expenses, Integer> {

    List<Expenses> findAll();

}
