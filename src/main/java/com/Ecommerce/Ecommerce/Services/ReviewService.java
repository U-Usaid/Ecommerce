package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Reviews;
import com.Ecommerce.Ecommerce.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public List<Reviews> getAllReviews(){
        return reviewRepository.findAll();
    }
}
