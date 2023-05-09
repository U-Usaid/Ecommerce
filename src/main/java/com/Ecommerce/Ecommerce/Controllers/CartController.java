package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Carts;
import com.Ecommerce.Ecommerce.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cart")
public class CartController {
    @Autowired
    CartService cartService;
    @GetMapping(value = "getAll")
    public List<Carts> getCarts() {
        return cartService.getAllCarts();
    }
}
