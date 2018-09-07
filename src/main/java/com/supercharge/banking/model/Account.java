package com.supercharge.banking.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Account {

    private final User user;
    private BigDecimal balance;
    private List<Transaction> transactionHistory = new LinkedList<Transaction>();

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
        transactionHistory.add(new Transaction(this.user, Calendar.getInstance(), sum, this.balance, "deposit"));
    }

    public void subtractMoney(BigDecimal sum) {
        this.balance.subtract(sum);
        transactionHistory.add(new Transaction(this.user, Calendar.getInstance(), sum, this.balance, "withdrawal"));
    }


    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
