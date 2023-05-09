package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.ShippingAddresses;
import com.Ecommerce.Ecommerce.Services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "shippingAddress")
public class ShippingAddressController {
    @Autowired
    ShippingAddressService shippingAddressService;

    @GetMapping(value = "getAll")
    public List<ShippingAddresses> getShippingAddresses(){
        return shippingAddressService.getAllShippingAddresses();
    }
}
