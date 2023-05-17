package com.example.ShoppingApplication.CartService.CartModel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int CartItems;
    private double Cartprice;
    private String CartPaymentMethod;

    public Cart() {
    }

    public Cart(int cartItems, double cartprice, String cartPaymentMethod) {
        CartItems = cartItems;
        Cartprice = cartprice;
        CartPaymentMethod = cartPaymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartItems() {
        return CartItems;
    }

    public void setCartItems(int cartItems) {
        CartItems = cartItems;
    }

    public double getCartprice() {
        return Cartprice;
    }

    public void setCartprice(double cartprice) {
        Cartprice = cartprice;
    }

    public String getCartPaymentMethod() {
        return CartPaymentMethod;
    }

    public void setCartPaymentMethod(String cartPaymentMethod) {
        CartPaymentMethod = cartPaymentMethod;
    }
}
