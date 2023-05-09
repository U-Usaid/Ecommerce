package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.ShippingAddresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressRepository extends JpaRepository <ShippingAddresses, Integer> {
}
