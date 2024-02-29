package com.example.ratingservice.impl;

import com.example.ratingservice.Entities.Rating;
import com.example.ratingservice.repository.RatingRepository;
import com.example.ratingservice.service.RatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    private static final Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        logger.info("Saving rating: {}", rating);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        logger.info("Saving all Rating");
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserid(int userid) {
        logger.info("Saving user id Rating");
        return ratingRepository.findAllByUserid(userid);
    }

    @Override
    public List<Rating> getRatingByHotelid(int hotelid) {
        logger.info("Saving hotel id Rating");
        return ratingRepository.findAllByHotelid(hotelid);
    }

    @Override
    public List<Rating> getRatingByRatingid(int ratingid) {
        logger.info("Saving rating id Rating");
        return ratingRepository.findAllByRatingid(ratingid);
    }
}