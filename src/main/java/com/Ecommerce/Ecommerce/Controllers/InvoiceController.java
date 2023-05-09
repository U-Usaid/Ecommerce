package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Invoices;
import com.Ecommerce.Ecommerce.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping(value = "getAll")
    public List<Invoices> getInvoices(){
        return invoiceService.getAllInvoices();
    }
}
