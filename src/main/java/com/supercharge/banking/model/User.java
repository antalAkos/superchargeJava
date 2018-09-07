package com.supercharge.banking.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class User {

    private String name;
    private Account account;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void deposit(BigDecimal sum) {
        this.account.addMoney(sum);
    }

    public void withDraw(BigDecimal sum) {
        this.account.subtractMoney(sum);
    }

    public void transfer(User toUser, BigDecimal sum) {
        this.account.subtractMoney(sum);
        toUser.getAccount().addMoney(sum);
    }

    public void printTransactionHistory() {
        System.out.println("Transactions by: " + this.name);
        this.account.getTransactionHistory().forEach(s -> System.out.println(s.toString()));
    }

    public List<Transaction> getTransactionByDirection(String type) {
        List<Transaction> transactions = this.account.getTransactionHistory()
                .stream()
                .filter(s -> s.getType().equals(type)).collect(Collectors.toList());
        return transactions;
    }

    public List<Transaction> getTransactionsByDate(Calendar date) {
        String dateToFind =  new SimpleDateFormat("yyyy-MM-dd").format(date.getTime());
        List <Transaction> transactions = this.account.getTransactionHistory()
                .stream()
                .filter(s ->  new SimpleDateFormat("yyyy-MM-dd").format(s.getTransactionTime().getTime()).equals(dateToFind)).collect(Collectors.toList());
        return transactions;
    }


}
