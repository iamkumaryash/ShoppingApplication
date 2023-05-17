package com.example.ShoppingApplication.CartService.Services;

import com.example.ShoppingApplication.CartService.CartModel.Cart;

import java.util.Optional;

public interface CartServices {

    Optional<Cart> cartItemsById(int id);
}
