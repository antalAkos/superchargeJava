package com.supercharge.banking.model;

import java.math.BigDecimal;
import java.util.Calendar;

public class TransactionHistory {

    private User user;
    private Calendar transactionTime;
    private BigDecimal amount;
    private BigDecimal balance;

    public TransactionHistory(User user, Calendar transactionTime, BigDecimal amount, BigDecimal balance) {
        this.user = user;
        this.transactionTime = transactionTime;
        this.amount = amount;
        this.balance = balance;
    }
}
