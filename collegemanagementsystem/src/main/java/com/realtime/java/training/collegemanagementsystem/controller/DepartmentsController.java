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
import com.realtime.java.training.collegemanagementsystem.pojo.StudentModel;
import com.realtime.java.training.collegemanagementsystem.service.DepartmentService;

@RequestMapping("/")
@RestController
public class DepartmentsController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/")
	public String test() {
		return "Testrd5tf6gy7uhijop";

	}

	@GetMapping("/list")
	public List<Departments> getDepartmentsList() {

		
		return departmentService.getDepartmentList();

	}

	@PostMapping("departments/save")
	public String saveDepartment(@RequestBody Departments departments) {

		if (departments != null)
			return departmentService.saveDeparment(departments);

		return null;

	}

	@GetMapping("/studentdetsils")
	public StudentModel getStudentDetails() {

		StudentModel student = new StudentModel();
		student.setName("Antony");
		student.setAge("28");
		return student;

	}

	@GetMapping("/studentdetsils/list")
	public List<StudentModel> getStudentDetailsList() {

		List<StudentModel> studentsList = new ArrayList<>();

		StudentModel student = new StudentModel();
		student.setName("Antony");
		student.setAge("28");

		StudentModel student1 = new StudentModel();
		student1.setName("Jaddu");
		student1.setAge("28");

		StudentModel student2 = new StudentModel();
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
