package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	
	@GetMapping("/message")
	public String message()
	{
		return "Spring Boot Application Deploy Successfully..";
	}

}
