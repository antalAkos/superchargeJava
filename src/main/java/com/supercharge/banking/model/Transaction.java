package com.supercharge.banking.model;

import java.math.BigDecimal;
import java.util.Calendar;

public class Transaction {

    private User user;
    private Calendar transactionTime;
    private BigDecimal amount;
    private BigDecimal balance;
    private String type;

    public Transaction(User user, Calendar transactionTime, BigDecimal amount, BigDecimal balance, String type) {
        this.user = user;
        this.transactionTime = transactionTime;
        this.amount = amount;
        this.balance = balance;
        this.type = type;
    }

    public Calendar getTransactionTime() {
        return transactionTime;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.type + "|" + this.amount.toString() + "|" + this.transactionTime.toString() + "|" + this.balance.toString();
    }
}
