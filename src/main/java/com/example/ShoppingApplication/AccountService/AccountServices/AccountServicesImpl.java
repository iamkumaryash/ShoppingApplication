package com.example.ShoppingApplication.AccountService.AccountServices;

import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServicesImpl implements AccountServices {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Optional<Account> accountNameById(int id) {
        return accountRepository.findById(id);
    }
}
