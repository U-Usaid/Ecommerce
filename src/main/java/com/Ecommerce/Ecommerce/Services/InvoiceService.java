package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Invoices;
import com.Ecommerce.Ecommerce.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoices> getAllInvoices(){
        return invoiceRepository.findAll();
    }
}
