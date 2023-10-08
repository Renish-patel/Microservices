package com.restaurant.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.userservice.UserServices.UserServices;
import com.restaurant.userservice.entities.User;

@RestController
@RequestMapping("/users")
public class UserControllers {
	
	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1 = userServices.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
			User users =  userServices.getUser(userId);
			return ResponseEntity.ok(users);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
	 List<User> allUsers= userServices.getAllUser();
		return ResponseEntity.ok(allUsers);
	}
	
	
}
