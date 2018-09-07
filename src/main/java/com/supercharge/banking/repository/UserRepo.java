package com.supercharge.banking.repository;

import com.supercharge.banking.model.User;

import java.util.List;

public class UserRepo {

    private List<User> users;

    public UserRepo(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
