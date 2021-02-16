package com.resto.resto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		System.out.print("Im In Java Main Class");
		SpringApplication.run(RestaurantApplication.class, args);
	}

}
