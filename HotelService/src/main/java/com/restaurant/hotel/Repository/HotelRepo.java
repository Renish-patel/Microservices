package com.restaurant.hotel.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.hotel.entity.Hotel;


public interface HotelRepo extends JpaRepository<Hotel,String>{

}