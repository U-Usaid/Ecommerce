package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Ratings;
import com.Ecommerce.Ecommerce.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "rating")
public class RatingController {
    @Autowired
    RatingService ratingService;

    @GetMapping(value = "getAll")

    public List<Ratings> getRatings (){
        return ratingService.getAllRatings();
    }
}
