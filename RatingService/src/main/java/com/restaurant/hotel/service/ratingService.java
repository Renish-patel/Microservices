package com.restaurant.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.hotel.entities.Rating;

@Service
public interface ratingService {
	//create 
	Rating createRating(Rating rating);
	
	
	//get all ratings 
	List<Rating> getallRatings();
	
	
	//get all by userId
	List<Rating> getByUserId(String userId);
	
	
	//get all by hotelId
	List<Rating> getByHotelId(String hotelId);
	
}
