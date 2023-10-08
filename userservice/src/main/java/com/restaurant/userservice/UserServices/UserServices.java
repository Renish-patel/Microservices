package com.restaurant.userservice.UserServices;

import java.util.List;

import com.restaurant.userservice.entities.User;

public interface UserServices {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);

}