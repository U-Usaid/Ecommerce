package com.Ecommerce.Ecommerce.Controllers;

import com.Ecommerce.Ecommerce.Models.Reviews;
import com.Ecommerce.Ecommerce.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping(value = "getALl")

    public List<Reviews> getReviews(){
        return reviewService.getAllReviews();
    }
}
