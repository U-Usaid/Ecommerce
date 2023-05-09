package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository <Payments,Integer> {
}
