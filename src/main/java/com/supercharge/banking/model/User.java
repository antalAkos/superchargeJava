package com.supercharge.banking.model;

import java.math.BigDecimal;

public class User {

    private String name;
    private Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
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
        this.account.setBalance(this.account.getBalance().add(sum));
    }

    public void withDraw(BigDecimal sum) {
        this.account.setBalance(this.account.getBalance().subtract(sum));
    }
}
