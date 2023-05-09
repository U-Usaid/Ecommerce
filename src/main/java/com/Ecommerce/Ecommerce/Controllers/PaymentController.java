package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Payments;
import com.Ecommerce.Ecommerce.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping(value = "getAll")

    public List<Payments> getPayments(){
        return paymentService.getAllPayments();
    }
}
