package com.example.ShoppingApplication.AccountService.Loader;


import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Accountloader {

    @Autowired
    AccountRepository accountRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING ACCOUNT DATA");
        accountRepository.saveAll(getData());
        System.out.println("ACCOUNT LOADING COMPLETE");
    }

    private List<Account> getData() {
        List<Account> accountList = new ArrayList<>();
        accountList.add( new Account( "KSM", "1111", "ksm@gmail.com", 9739265284L, "c3919"));
        accountList.add( new Account( "AKM", "2222", "akm@gmail.com", 9113694742L, "c3918"));
        accountList.add( new Account( "SM", "3333", "sm@gmail.com", 9839049360L, "c3917"));
        accountList.add( new Account( "KYM", "4444", "kym@gmail.com", 9984047321L, "c3916"));
        return accountList;
    }
}

