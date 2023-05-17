package com.example.ShoppingApplication.CartService.CartLoader;


import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import com.example.ShoppingApplication.CartService.CartModel.Cart;
import com.example.ShoppingApplication.CartService.CartRepository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    CartRepository cartRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING CART DATA");
        cartRepository.saveAll(getData());
        System.out.println("CART LOADING COMPLETE");
    }

    private List<Cart> getData() {
        List<Cart> cartList = new ArrayList<>();
        cartList.add( new Cart( 5, 2000.00, "cash"));
        cartList.add( new Cart( 6, 3000.00, "card"));
        cartList.add( new Cart( 2, 3333.30, "cash"));
        cartList.add( new Cart( 3, 4444.40, "card"));
        return cartList;
    }
}
