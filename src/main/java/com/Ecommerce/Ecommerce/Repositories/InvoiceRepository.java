package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoices,Integer> {
}
