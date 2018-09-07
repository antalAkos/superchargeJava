package com.supercharge.banking.repository;

import com.supercharge.banking.model.Transaction;
import com.supercharge.banking.model.User;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepo {

    private final User user;
    private List<Transaction> transactions = new ArrayList<>();

    public TransactionRepo(User user) {
        this.user = user;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public User getUser() {
        return user;
    }
}
