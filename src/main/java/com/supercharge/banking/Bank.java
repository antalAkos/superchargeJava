package com.supercharge.banking;

import com.supercharge.banking.model.Account;
import com.supercharge.banking.model.User;

import java.math.BigDecimal;

public class Bank {

    public static void main(String[] args) {
        User user = new User("user1");
        User user2 = new User("user2");
        user2.setAccount(new Account(user2));
        user.setAccount(new Account(user));
        user.deposit(new BigDecimal(1000));
        user.withDraw(new BigDecimal(50));
        user.transfer(user2, new BigDecimal(20));
        System.out.println(user.getTransactionByDirection("withdrawal"));
        user.printTransactionHistory();
    }
}
