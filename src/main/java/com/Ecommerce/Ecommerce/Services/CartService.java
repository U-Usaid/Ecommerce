package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Carts;
import com.Ecommerce.Ecommerce.Repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    public List<Carts>getAllCarts() {
        return cartRepository.findAll();
    }
}
