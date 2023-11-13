package com.realtime.java.learning.collegemanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("welcome")
	public String showWelcomeMessage() {
		return "Welcome to college Management System :)";
	}
		
		@GetMapping("studentlist")
		public String getstudentlist() {
			return "Here is the student list below:";
	}
	

}
@RestController
class facultyController{
	@GetMapping("schedule")
	public String showSchedule() {
		return "Professors class Schedule:";
	}
	
	@GetMapping("faculty")
	public String showfacultylist() {
		return "Here is the faculty list below:";
	}
	
	
	
}

