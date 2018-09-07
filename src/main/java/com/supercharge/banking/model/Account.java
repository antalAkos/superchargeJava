package com.supercharge.banking.model;

import java.math.BigDecimal;

public class Account {

    private final User user;
    private BigDecimal balance;

    public Account(User user) {
        this.user = user;
    }

    public  BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addMoney(BigDecimal sum) {
        this.balance.add(sum);
    }

    public void subtractMoney(BigDecimal sum) {
        this.balance.subtract(sum);
    }

}
