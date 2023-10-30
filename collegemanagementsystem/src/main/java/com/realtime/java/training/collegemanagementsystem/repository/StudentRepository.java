package com.realtime.java.training.collegemanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.realtime.java.training.collegemanagementsystem.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>  {

}
