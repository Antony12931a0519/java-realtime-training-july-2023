package com.realtime.java.training.collegemanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtime.java.training.collegemanagementsystem.pojo.Student;

@RestController
public class DepartmentsController {

	@GetMapping("/")
	public String test() {
		return "Testrd5tf6gy7uhijop";

	}

	@GetMapping("/list")
	public List<String> getDepartmentsList() {

		List<String> departments = new ArrayList<>();
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		departments.add("CSE");
		return departments;

	}

	@GetMapping("/studentdetsils")
	public Student getStudentDetails() {

		Student student = new Student();
		student.setName("Antony");
		student.setAge("28");
		return student;

	}

	@GetMapping("/studentdetsils/list")
	public List<Student> getStudentDetailsList() {

		List<Student> studentsList = new ArrayList<>();

		Student student = new Student();
		student.setName("Antony");
		student.setAge("28");

		Student student1 = new Student();
		student1.setName("Jaddu");
		student1.setAge("28");

		Student student2 = new Student();
		student2.setName("Rakesh");
		student2.setAge("28");

		studentsList.add(student);
		studentsList.add(student1);
		studentsList.add(student2);

		return studentsList;

	}

	@GetMapping("/faculty/list")
	public List<String> getDepartmentsFacultyList() {

		List<String> departmentsFacultyList = new ArrayList<>();
		departmentsFacultyList.add("Anthony");
		return departmentsFacultyList;

	}

}