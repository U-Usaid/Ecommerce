package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Carts,Integer> {
}
