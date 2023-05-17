package com.example.ShoppingApplication.DeliveryServices.DeliveryLoader;

import com.example.ShoppingApplication.DeliveryServices.DeliveryModel.Delivery;
import com.example.ShoppingApplication.DeliveryServices.Repository.DeliveryRepository;
import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Loader
@Component
public class DeliveryLoader {

    @Autowired
    DeliveryRepository deliveryRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING DELIVERY DATA");
        deliveryRepository.saveAll(getData());
        System.out.println("DELIVERY LOADING COMPLETE");
    }

    private List<Delivery> getData() {
        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList.add( new Delivery( Boolean.TRUE, "3916", Boolean.TRUE));
        deliveryList.add( new Delivery( Boolean.FALSE, "c-3917", Boolean.TRUE));
        deliveryList.add( new Delivery( Boolean.FALSE, "c-3918", Boolean.TRUE));
        deliveryList.add( new Delivery( Boolean.TRUE, "c-3919", Boolean.TRUE));
        return deliveryList;
    }
}
