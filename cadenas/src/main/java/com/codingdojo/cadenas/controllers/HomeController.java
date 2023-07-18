package com.codingdojo.cadenas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are u doing";
	}

	@RequestMapping("/random")
	public String msj() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	

	
}
