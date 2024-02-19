package com.example.ratingservice.repository;

import com.example.ratingservice.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String> {
  
    List<Rating> findAllByUserid(long userid);
    List<Rating> findAllByHotelid(int hotelid);
    List<Rating> findAllByRatingid(int ratingid);
}
