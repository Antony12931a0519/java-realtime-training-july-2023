package com.realtime.java.training.collegemanagementsystem.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.repository.CrudRepository;

import com.realtime.java.training.collegemanagementsystem.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>  {
	
	public List<Student> findStudentsByName(@PathParam("name") String name);

}
