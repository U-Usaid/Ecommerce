package com.Ecommerce.Ecommerce.Repositories;

import com.Ecommerce.Ecommerce.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews,Integer> {
}
