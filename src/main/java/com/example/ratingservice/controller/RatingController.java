package com.example.ratingservice.controller;

import com.example.ratingservice.Entities.Rating;
import com.example.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/ratings")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
      return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>> getAllUser(){
        List<Rating> allRating= ratingService.getAllRatings();
        return ResponseEntity.ok(allRating);
    }

    @GetMapping("/ratings/user/{userid}")
    public ResponseEntity<List<Rating>> getRatingsByUserid(@PathVariable int userid){
        return ResponseEntity.ok(ratingService.getRatingByUserid(userid));
    }
    @GetMapping("/ratings/{ratingid}")
    public ResponseEntity<List<Rating>> getRatingsByRatingid(@PathVariable int ratingid){
        return ResponseEntity.ok(ratingService.getRatingByRatingid(ratingid));
    }

    @GetMapping("/ratings/hotels/{hotelid}")
    public ResponseEntity<List<Rating>> getRatingsByHotelid(@PathVariable int hotelid){
        return ResponseEntity.ok(ratingService.getRatingByHotelid(hotelid));
    }
}
