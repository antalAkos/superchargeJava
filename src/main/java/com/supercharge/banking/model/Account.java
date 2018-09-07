package com.supercharge.banking.model;

import com.supercharge.banking.repository.TransactionRepo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Account {

    private final User user;
    private BigDecimal balance;
    private TransactionRepo transactionRepo;

    public Account(User user) {
        this.user = user;
        this.transactionRepo = new TransactionRepo(user);
    }

    public  BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addMoney(BigDecimal sum) {
        this.balance.add(sum);
        transactionRepo.addTransaction(new Transaction(this.user, Calendar.getInstance(), sum, this.balance, "deposit"));
    }

    public void subtractMoney(BigDecimal sum) {
        this.balance.subtract(sum);
        transactionRepo.addTransaction(new Transaction(this.user, Calendar.getInstance(), sum, this.balance, "withdrawal"));
    }


    public List<Transaction> getTransactionHistory() {
        return transactionRepo.getTransactions();
    }
}
