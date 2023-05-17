package com.example.ShoppingApplication.ProductCatalogueService.ProductRepository;

import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
