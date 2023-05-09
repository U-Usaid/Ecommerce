package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.ShippingAddresses;
import com.Ecommerce.Ecommerce.Repositories.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressService {
    @Autowired
    ShippingAddressRepository shippingAddressRepository;

    public List<ShippingAddresses> getAllShippingAddresses(){
        return shippingAddressRepository.findAll();
    }
}
