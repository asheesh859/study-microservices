package com.microservice_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro")
public class MicroserviceController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to the microservice.";
	}
	

}
