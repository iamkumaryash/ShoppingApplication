package com.example.ShoppingApplication.DeliveryServices.Repository;

import com.example.ShoppingApplication.DeliveryServices.DeliveryModel.Delivery;
import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer> {
}
