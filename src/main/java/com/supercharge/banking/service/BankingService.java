package com.supercharge.banking.service;

import com.supercharge.banking.model.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BankingService {

    public void deposit(User user, BigDecimal sum) {
        user.getAccount().addMoney(sum);
    }


}
