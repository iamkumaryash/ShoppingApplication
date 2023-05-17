package com.example.ShoppingApplication.AccountService.AccountServices;

import com.example.ShoppingApplication.AccountService.AccountModel.Account;

import java.util.Optional;

public interface AccountServices {

 Optional<Account> accountNameById(int id);
}
