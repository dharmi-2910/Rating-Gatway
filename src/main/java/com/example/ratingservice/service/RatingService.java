package com.example.ratingservice.service;

import com.example.ratingservice.Entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name="RATING-SERVICES")
public interface RatingService {

    Rating create(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserid(int userid);
    List<Rating> getRatingByHotelid(int hotelid);
    List<Rating> getRatingByRatingid(int ratingid);

    @GetMapping("/ratings/{id}")
    Rating getRating(@PathVariable int id);
}
