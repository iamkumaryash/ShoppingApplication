package com.example.ShoppingApplication.AccountService.AccountRepository;

import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.ShoppingApplication;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
