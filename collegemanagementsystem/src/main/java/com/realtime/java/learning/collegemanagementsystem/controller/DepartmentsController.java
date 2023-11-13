package com.realtime.java.learning.collegemanagementsystem.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.realtime.java.learning.collegemanagementsystem.pojo.Patient;
import com.realtime.java.learning.collegemanagementsystem.pojo.Student;
import com.realtime.java.learning.collegemanagementsystem.services.PatientServices;
import com.realtime.java.learning.collegemanagementsystem.entities.Admin;

@RestController
public class DepartmentsController {

	@Autowired
	private PatientServices patientServices;
	
	@GetMapping("/list")
	public List<String> getDepartmentsList() {
		
		List<String> departments = new ArrayList<>();
		departments.add("CSE");
		departments.add("ECE");
		departments.add("MECH");
		departments.add("CIVIL");
		departments.add("EEE");
		departments.add("CS/A.I");
		departments.add("CS/M.L");
		departments.add("ECE/ROBOTICS");
		return departments;	
	}
	@GetMapping("deparments/Student/details")
	public Student getStudentdetails() {
		Student S = new Student();
		S.setName("John");
		S.setAge(20);
		return S;	
	}
	
	@GetMapping("deparments/Student/details/list")
	public List<Student> getStudentdetailslist() {
		List<Student> studentlist=new ArrayList<>();
		Student S = new Student();
		S.setName("John");
		S.setAge(20);
		
		Student S1 = new Student();
		S1.setName("Alias");
		S1.setAge(21);
		
		Student S2 = new Student();
		S2.setName("Francis");
		S2.setAge(24);
		
		Student S3 = new Student();
		S3.setName("Mary");
		S3.setAge(26);
		studentlist.add(S);
		studentlist.add(S1);
		studentlist.add(S2);
		studentlist.add(S3);		
		return studentlist;		
	}
	@GetMapping("/faculty/list")
	public List<String> getDepartmentsFacultyList() {
		
		List<String> departmentsFacultyList = new ArrayList<String>();
		departmentsFacultyList.add("Ramadevi-CSE");
		departmentsFacultyList.add("Mukesh-ECE");
		departmentsFacultyList.add("Ramesh-MECH");
		departmentsFacultyList.add("Chary-CIVIL");
		departmentsFacultyList.add("Karthik-EEE");
		departmentsFacultyList.add("Gayathri-CS/A.I");
		departmentsFacultyList.add("Madhavi-CS/M.L");
		departmentsFacultyList.add("Santhosh-ECE/ROBOTICS");

		return departmentsFacultyList;
	}
	@PostMapping("patient/details")
	public String getDetailsOfPatient(@RequestBody Patient patient) {
		if (patient != null)
			return patientServices.getDetailsOfPatient(patient);
		return null;
	}
	@GetMapping("/University/list")
	public List<Admin> getUniversityList() {
		return patientServices.getUniversityList();

	}

	

}
