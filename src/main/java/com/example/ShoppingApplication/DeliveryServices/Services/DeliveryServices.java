package com.example.ShoppingApplication.DeliveryServices.Services;

import com.example.ShoppingApplication.DeliveryServices.DeliveryModel.Delivery;

import java.util.Optional;

public interface DeliveryServices {

    Optional<Delivery> deliveryAddressById(int id);
}
