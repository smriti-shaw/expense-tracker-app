package com.learnthetek.expensetracker.VO;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class ExpenseRequestVO implements Serializable, Cloneable {

    Integer userId;
    LocalDateTime dateOfExpense;
    String expenseName;
    String expenseType;
    MoneyVO Amount;

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
    public String toString() {
        return "ExpenseRequestVO{" +
                "userId=" + userId +
                ", dateOfExpense=" + dateOfExpense +
                ", expenseName='" + expenseName + '\'' +
                ", expenseType='" + expenseType + '\'' +
                ", Amount=" + Amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseRequestVO that = (ExpenseRequestVO) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(dateOfExpense, that.dateOfExpense) &&
                Objects.equals(expenseName, that.expenseName) &&
                Objects.equals(expenseType, that.expenseType) &&
                Objects.equals(Amount, that.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, dateOfExpense, expenseName, expenseType, Amount);
    }
}
