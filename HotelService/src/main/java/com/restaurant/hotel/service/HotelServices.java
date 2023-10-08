package com.restaurant.hotel.service;
import java.util.List;

import com.restaurant.hotel.entity.Hotel;


public interface HotelServices {

	//create 
	Hotel create(Hotel hotel);
	
	//getall
	List<Hotel> getall();
	
	//get single
	Hotel getHotel(String id);
}