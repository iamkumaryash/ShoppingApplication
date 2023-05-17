package com.example.ShoppingApplication.ProductCatalogueService.ProductResources;

import com.example.ShoppingApplication.AccountService.AccountRepository.AccountRepository;
import com.example.ShoppingApplication.ProductCatalogueService.ProductModel.Product;
import com.example.ShoppingApplication.ProductCatalogueService.ProductServices.ProductServiceImpl;
import com.example.ShoppingApplication.ProductCatalogueService.ProductRepository.ProductRepository;
import com.example.ShoppingApplication.ShoppingApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/Account")
public class ProductResources {

    @Autowired
    ProductServiceImpl productService;

    @RequestMapping(value = "/productName/{id}",method = RequestMethod.GET)
    public Optional<Product>productNameById (@PathVariable ("id")int id){
      Optional<Product> p = productService.productNameById(id);
      return p;
    }
}
