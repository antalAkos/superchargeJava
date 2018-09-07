package com.supercharge.banking.repository;

import com.supercharge.banking.model.Account;
import com.supercharge.banking.model.User;

import java.util.ArrayList;
import java.util.List;

public class AccountRepo {

    private final User user;
    private List<Account> Accounts = new ArrayList<>();

    public AccountRepo(User user) {
        this.user = user;
    }

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void addAccount(Account Account) {
        this.Accounts.add(Account);
    }
}
