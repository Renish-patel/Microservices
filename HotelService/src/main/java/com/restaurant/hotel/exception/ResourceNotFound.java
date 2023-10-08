package com.restaurant.hotel.exception;


public class ResourceNotFound extends RuntimeException {
	public ResourceNotFound (String string) {
		super(string);
		
	}
	
	public ResourceNotFound() {
		super("resourceNotFound");
	}
}