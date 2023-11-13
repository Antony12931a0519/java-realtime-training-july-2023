package com.realtime.java.learning.collegemanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.realtime.java.learning.collegemanagementsystem.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	//public List<Student> findStudentsByName(@PathParam("name") String name);

}
