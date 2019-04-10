package com.learnthetek.expensetracker.dao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "expenses")
public class Expenses {

    @Id @GeneratedValue
    @Column(name ="id")
    Integer id;

    @Column(name ="user_id")
    Integer userId;

    @Column(name ="additional_details")
    String additionalDetails;

    @Column(name ="date_of_creation")
    LocalDateTime dateOfCreation;

    @Column(name ="amount")
    BigDecimal amount;

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

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expenses expenses = (Expenses) o;
        return Objects.equals(id, expenses.id) &&
                Objects.equals(userId, expenses.userId) &&
                Objects.equals(additionalDetails, expenses.additionalDetails) &&
                Objects.equals(dateOfCreation, expenses.dateOfCreation) &&
                Objects.equals(amount, expenses.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, additionalDetails, dateOfCreation, amount);
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id +
                ", userId=" + userId +
                ", additionalDetails='" + additionalDetails + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", amount=" + amount +
                '}';
    }
}
