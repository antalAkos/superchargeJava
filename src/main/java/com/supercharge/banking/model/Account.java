package com.supercharge.banking.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Account {

    private final User user;
    private BigDecimal balance;
    private List<TransactionHistory> transactionHistories = new LinkedList<TransactionHistory>();

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
        transactionHistories.add(new TransactionHistory(this.user, Calendar.getInstance(), sum, this.balance));
    }

    public void subtractMoney(BigDecimal sum) {
        this.balance.subtract(sum);
        transactionHistories.add(new TransactionHistory(this.user, Calendar.getInstance(), sum, this.balance));
    }

}
