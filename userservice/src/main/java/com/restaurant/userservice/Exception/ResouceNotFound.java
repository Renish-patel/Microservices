package com.restaurant.userservice.Exception;
import jakarta.annotation.Resource;

public class ResouceNotFound extends RuntimeException{
	
	public ResouceNotFound() {
		super("Resource not found Exception");
	}
	
	public ResouceNotFound(String message) {
		super(message);
	}
}
