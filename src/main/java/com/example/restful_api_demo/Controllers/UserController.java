package com.example.restful_api_demo.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.example.restful_api_demo.Models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/user")
	public User user(
        @RequestParam(value = "name", defaultValue = "Jhon") String name,
        @RequestParam(value = "lastName", defaultValue = "Doe") String lastName,
        @RequestParam(value = "address", defaultValue = "No.00 Example Street, Antartic, A Continent") String address) {
		return new User(
            counter.incrementAndGet(),
            name, lastName, address
        );
	}
    
}
