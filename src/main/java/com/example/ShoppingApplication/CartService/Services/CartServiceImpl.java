package com.example.ShoppingApplication.CartService.Services;

import com.example.ShoppingApplication.CartService.CartModel.Cart;
import com.example.ShoppingApplication.CartService.CartRepository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartServices {

    @Autowired
    CartRepository cartRepository;


    @Override
    public Optional<Cart> cartItemsById(int id) {
        return Optional.empty();
    }
}
