package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Payments;
import com.Ecommerce.Ecommerce.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public List<Payments> getAllPayments(){
        return paymentRepository.findAll();
    }
}
