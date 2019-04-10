package com.learnthetek.expensetracker.VO;

import java.math.BigDecimal;
import java.util.Objects;

public class MoneyVO {

    String currency;
    BigDecimal amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
        MoneyVO moneyVO = (MoneyVO) o;
        return Objects.equals(currency, moneyVO.currency) &&
                Objects.equals(amount, moneyVO.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }

    @Override
    public String toString() {
        return "MoneyVO{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
