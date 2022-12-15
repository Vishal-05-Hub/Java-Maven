package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Testcontroller {
	@GetMapping("/")
	
	public String sayhello() {
		
		return "HELLO WORLD HOW ARE You";
	}
	

}
