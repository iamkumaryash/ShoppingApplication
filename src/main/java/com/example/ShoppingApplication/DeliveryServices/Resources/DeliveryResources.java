package com.example.ShoppingApplication.DeliveryServices.Resources;


import com.example.ShoppingApplication.DeliveryServices.DeliveryModel.Delivery;
import com.example.ShoppingApplication.DeliveryServices.Repository.DeliveryRepository;
import com.example.ShoppingApplication.DeliveryServices.Services.DeliveryServices;
import com.example.ShoppingApplication.DeliveryServices.Services.DeliveryServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/rest/Delivery")
public class DeliveryResources {


    @Autowired
    DeliveryServicesImpl deliveryServices;

    @RequestMapping(value = "/DeliveryAddress/{id}", method = RequestMethod.GET)
    public Optional<Delivery> DeliveryAddressById(@Param("id") int id) {
        Optional<Delivery> d = deliveryServices.deliveryAddressById(id);
        return d;
    }
}
