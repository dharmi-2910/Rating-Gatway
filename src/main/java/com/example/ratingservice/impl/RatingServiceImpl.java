package com.example.ratingservice.impl;

import com.example.ratingservice.Entities.Hotel;
import com.example.ratingservice.Entities.Rating;
import com.example.ratingservice.repository.RatingRepository;
import com.example.ratingservice.service.HotelService;
import com.example.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserid(int userid) {
        return ratingRepository.findAllByUserid(userid);
    }

    @Override
    public List<Rating> getRatingByHotelid(int hotelid) {
        return ratingRepository.findAllByHotelid(hotelid);
    }

    @Override
    public List<Rating> getRatingByRatingid(int ratingid) {
        return ratingRepository.findAllByRatingid(ratingid);
    }
}