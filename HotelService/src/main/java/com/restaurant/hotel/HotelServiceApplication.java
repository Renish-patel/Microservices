package com.restaurant.hotel;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HotelServiceApplication {
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HotelServiceApplication.class);
        System.setProperty("spring.config.name", "Hotel-service");
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
              app.run(args);
	}


}
