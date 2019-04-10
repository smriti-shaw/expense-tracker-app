package com.learnthetek.expensetracker.model;

import com.learnthetek.expensetracker.VO.MoneyVO;

import java.time.LocalDateTime;
import java.util.Objects;

public class ExpensesDTO {

    Integer id;
    Integer userId;
    LocalDateTime dateOfExpense;
    String expenseName;
    String expenseType;
    MoneyVO Amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateOfExpense() {
        return dateOfExpense;
    }

    public void setDateOfExpense(LocalDateTime dateOfExpense) {
        this.dateOfExpense = dateOfExpense;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public MoneyVO getAmount() {
        return Amount;
    }

    public void setAmount(MoneyVO amount) {
        Amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpensesDTO that = (ExpensesDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(dateOfExpense, that.dateOfExpense) &&
                Objects.equals(expenseName, that.expenseName) &&
                Objects.equals(expenseType, that.expenseType) &&
                Objects.equals(Amount, that.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, dateOfExpense, expenseName, expenseType, Amount);
    }

    @Override
    public String toString() {
        return "ExpensesDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", dateOfExpense=" + dateOfExpense +
                ", expenseName='" + expenseName + '\'' +
                ", expenseType='" + expenseType + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
