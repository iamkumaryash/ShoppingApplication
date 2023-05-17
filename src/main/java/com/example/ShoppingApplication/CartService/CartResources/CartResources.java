package com.example.ShoppingApplication.CartService.CartResources;

import com.example.ShoppingApplication.CartService.CartModel.Cart;
import com.example.ShoppingApplication.CartService.CartRepository.CartRepository;
import com.example.ShoppingApplication.CartService.Services.CartServiceImpl;
import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import com.example.ShoppingApplication.ProductCatalogueService.ProductRepository.ProductRepository;
import com.example.ShoppingApplication.ProductCatalogueService.ProductServices.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/rest/Cart")
public class CartResources {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    CartServiceImpl cartService;

    @RequestMapping(value = "/cartItems/{id}",method = RequestMethod.GET)
    public Optional<Cart> cartNameById (@PathVariable("id")int id){
        Optional<Cart> p = cartService.cartItemsById(id);
        return p;
    }
}
