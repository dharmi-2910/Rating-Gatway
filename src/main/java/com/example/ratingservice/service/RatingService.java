package com.example.ratingservice.service;

import com.example.ratingservice.Entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

public interface RatingService {

    Rating create(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserid(int userid);
    List<Rating> getRatingByHotelid(int hotelid);
    List<Rating> getRatingByRatingid(int ratingid);

}
