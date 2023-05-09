package com.Ecommerce.Ecommerce.Services;

import com.Ecommerce.Ecommerce.Models.Ratings;
import com.Ecommerce.Ecommerce.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public List<Ratings> getAllRatings(){
        return ratingRepository.findAll();
    }
}
