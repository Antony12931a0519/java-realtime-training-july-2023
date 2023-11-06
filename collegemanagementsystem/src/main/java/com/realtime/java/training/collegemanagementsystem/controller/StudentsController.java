package com.realtime.java.training.collegemanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtime.java.training.collegemanagementsystem.pojo.Departments;
import com.realtime.java.training.collegemanagementsystem.pojo.Student;
import com.realtime.java.training.collegemanagementsystem.service.DepartmentService;
import com.realtime.java.training.collegemanagementsystem.service.StudentsService;

@RequestMapping("/student")
@RestController
public class StudentsController {

	@Autowired
	private StudentsService studentsService;

	@GetMapping("/list")
	public List<com.realtime.java.training.collegemanagementsystem.entities.Student> getStudentsList() {

		return studentsService.getStudentsList();

	}
	
	@GetMapping("/list/basedonname")
	public List<com.realtime.java.training.collegemanagementsystem.entities.Student> 
	getStudentsListBasedonName(@RequestBody Student student) {

		return studentsService.getStudentsListBasedOnName(student.getName());

	}

	@PostMapping("list/basedonids")
	public List<com.realtime.java.training.collegemanagementsystem.entities.Student> getStudentsListByIds(
			@RequestBody Student student) {

		return studentsService.getStudentsListBasedOnIds(student.getIds());

	}

	@GetMapping("/id")
	public Student getStudentDetailsById(@RequestBody Student student) {

		return studentsService.getStudentBasedOnId(student.getId());

	}

}
