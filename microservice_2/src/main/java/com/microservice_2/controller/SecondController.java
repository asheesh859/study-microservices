package com.microservice_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice_2.client.Client;

@RestController
public class SecondController {

	@Autowired
	private Client client;
	
	@GetMapping("/msg")
	public String getMessageFromMicroservice_1() {
		return client.getMessage();
	}
}
