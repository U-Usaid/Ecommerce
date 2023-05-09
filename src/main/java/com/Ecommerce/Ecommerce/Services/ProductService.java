package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Products;
import com.Ecommerce.Ecommerce.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }
}
