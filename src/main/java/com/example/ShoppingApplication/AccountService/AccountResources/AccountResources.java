package com.example.ShoppingApplication.AccountService.AccountResources;

import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import com.example.ShoppingApplication.AccountService.AccountServices.AccountServices;
import com.example.ShoppingApplication.AccountService.AccountServices.AccountServicesImpl;
import com.example.ShoppingApplication.ShoppingApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/Account")
public class AccountResources {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountServicesImpl accountServices;

        @RequestMapping(value = "AccountName/{id}",method = RequestMethod.GET)
    public Optional<Account> accountNameById(@PathVariable("id")int id){
            Optional<Account> a= accountServices.accountNameById(id);
            return a;
        }
    }

