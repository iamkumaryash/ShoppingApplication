package com.example.ShoppingApplication.ProductCatalogueService.ProductServices;

import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import com.example.ShoppingApplication.ProductCatalogueService.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductServices{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Optional<Product> productNameById(int id){
        Optional<Product> Name= productRepository.findById(id);
        return Name;
    }

}
