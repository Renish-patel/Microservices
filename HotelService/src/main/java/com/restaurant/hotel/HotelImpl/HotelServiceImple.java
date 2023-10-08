package com.restaurant.hotel.HotelImpl;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.hotel.Repository.HotelRepo;
import com.restaurant.hotel.entity.Hotel;
import com.restaurant.hotel.exception.ResourceNotFound;
import com.restaurant.hotel.service.HotelServices;


@Service
public class HotelServiceImple implements HotelServices {
	
	@Autowired
	private HotelRepo hotelRepo;
	
	//save 
	@Override
	public Hotel create(Hotel hotel) {
		String id =  UUID.randomUUID().toString();
		hotel.setId(id);
		return hotelRepo.save(hotel);
	}

	// find all in database 
	@Override
	public List<Hotel> getall() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	
	@Override
	public Hotel getHotel(String id) {	
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFound("userId doesnot found"));
	}

}
