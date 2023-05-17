package com.example.ShoppingApplication.CartService.CartRepository;

import com.example.ShoppingApplication.AccountService.AccountModel.Account;
import com.example.ShoppingApplication.CartService.CartModel.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
