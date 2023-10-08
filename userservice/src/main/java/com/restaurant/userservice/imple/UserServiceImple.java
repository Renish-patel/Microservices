package com.restaurant.userservice.imple;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.userservice.Exception.ResouceNotFound;
import com.restaurant.userservice.Repositories.UserRepository;
import com.restaurant.userservice.UserServices.UserServices;
import com.restaurant.userservice.entities.User;


@Service 
public class UserServiceImple implements UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		//generate unique used id every time 
		String randomUserId =   UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResouceNotFound("userId doesnot found"+userId));
	}

	
}
