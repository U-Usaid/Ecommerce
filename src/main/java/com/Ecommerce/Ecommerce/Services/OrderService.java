package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Orders;
import com.Ecommerce.Ecommerce.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Orders> getAllOrders(){
        return orderRepository.findAll();
    }
}
