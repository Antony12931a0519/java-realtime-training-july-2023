package com.realtime.java.training.collegemanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping
	public String test() {
		return "Test";

	}
	
	@GetMapping("welcome")
	public String showWelcomeMessage() {
		return "Welcome to College Management System :)";
		
	}
	

	@GetMapping("studentslist")
	public String getstudentsList() {
		return " :) :)";
		
	}

}
