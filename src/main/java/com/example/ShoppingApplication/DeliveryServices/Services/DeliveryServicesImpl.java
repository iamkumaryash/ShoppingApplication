package com.example.ShoppingApplication.DeliveryServices.Services;

import com.example.ShoppingApplication.DeliveryServices.DeliveryModel.Delivery;
import com.example.ShoppingApplication.DeliveryServices.Repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeliveryServicesImpl implements DeliveryServices {

    @Autowired
    DeliveryRepository deliveryRepository;

    @Override
    public Optional<Delivery> deliveryAddressById(int id) {
        return Optional.empty();
    }
}
