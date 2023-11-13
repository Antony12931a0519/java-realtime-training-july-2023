package com.realtime.java.learning.collegemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtime.java.learning.collegemanagementsystem.pojo.Student;
import com.realtime.java.learning.collegemanagementsystem.services.StudentServices;


@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	private StudentServices studentServices;
	
	@GetMapping("/list")
	public List<com.realtime.java.learning.collegemanagementsystem.entities.Student> getStudentsList() {

		return studentServices.getStudentsList();

	}
	@PostMapping("list/basedonids")
	public List<com.realtime.java.learning.collegemanagementsystem.entities.Student> getStudentsListByIds(
			@RequestBody Student student) {

		return studentServices.getStudentsListBasedOnIds(student.getIds());

	}
	@GetMapping("/id")
	public com.realtime.java.learning.collegemanagementsystem.entities.Student getStudentDetailsById(@RequestBody Student student) {

		return studentServices.getStudentBasedOnId(student.getId());

	}
	
	
}
	