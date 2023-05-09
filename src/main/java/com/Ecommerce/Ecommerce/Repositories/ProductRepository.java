package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Products,Integer> {
}
