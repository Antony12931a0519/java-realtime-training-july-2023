package com.realtime.java.training.collegemanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;

import com.realtime.java.training.collegemanagementsystem.pojo.Departments;
import com.realtime.java.training.collegemanagementsystem.repository.DepartmentRepository;

@ServiceMode
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public String saveDeparment(Departments departments) {

		List<Departments> updatedDepartmentsList = new ArrayList<>();
		List<Departments> existingDepartmentsList = new ArrayList<>();

		for (Departments department : existingDepartmentsList) {
			if (departments.getDepartmentId() != department.getDepartmentId()) {
				updatedDepartmentsList.add(departments);
			}

		}

		if (updatedDepartmentsList.size() > existingDepartmentsList.size()) {
			return "Department details are added successfulllly";
		} else {
			return "Department details are not added successfully,Please try again";
		}

	}
	
	public List<Departments> getDepartmentList(){
		
		return (List<Departments>) departmentRepository.findAll();
	}

}
