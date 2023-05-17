package com.example.ShoppingApplication.ProductCatalogueService.ProductLoader;

import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import com.example.ShoppingApplication.ProductCatalogueService.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductLoader {

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING PRODUCT DATA");
        productRepository.saveAll(getData());
        System.out.println("PRODUCT LOADING COMPLETE");
    }

    private List<Product> getData() {
        List<Product> productList = new ArrayList<>();
        productList.add( new Product( "LG", "TV", "20000", "20"));
        productList.add( new Product( "SAMSUNG", "MOBILE", "10000", "15"));
        productList.add( new Product( "APPLE", "WATCH", "11000", "25"));
        productList.add( new Product( "MICROMAX", "AC", "35000", "30"));
        return productList;
    }
}
