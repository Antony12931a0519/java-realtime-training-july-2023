package com.realtime.java.training.collegemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.realtime.java.training.collegemanagementsystem.entities.Student;
import com.realtime.java.training.collegemanagementsystem.pojo.StudentModel;
import com.realtime.java.training.collegemanagementsystem.repository.StudentRepository;

@Service
public class StudentsService {

	@Autowired
	private StudentRepository StudentRepository;

	public List<Student> getStudentsList() {

		// select * from tablename
		// select * from tabel where id=1
		// select * from tabel where id in(1,2,3,4,5)

		Iterable<Student> studentsList = StudentRepository.findAll();

		return (List<Student>) studentsList;

	}

	public List<Student> getStudentsListBasedOnIds(List<Long> listOfstudentsIds) {

		// select * from tabel where id in(1,2,3,4,5)

		// List<Long> listOfstudentsIds = new Arraylist<>();
		// listOfstudentsIds.add(101l);
		// listOfstudentsIds.add(104l);
		//

		Iterable<Student> studentsList = StudentRepository.findAllById(listOfstudentsIds);

		return (List<Student>) studentsList;

	}

	public Student getStudentBasedOnId(long id) {

		// select * from tabel where id=1

		Optional<Student> student = StudentRepository.findById(id);

		return student.get();

	}

	public List<Student> getStudentsListBasedOnName(String name) {

		// select * from tabel where id in(1,2,3,4,5)

		// List<Long> listOfstudentsIds = new Arraylist<>();
		// listOfstudentsIds.add(101l);
		// listOfstudentsIds.add(104l);
		//

		Iterable<Student> studentsList = StudentRepository.findStudentsByName(name);

		return (List<Student>) studentsList;

	}

	public String saveStudentDetails(StudentModel studentModel) {

		Student student = new Student();

		student.setId(101);
		student.setAddress(studentModel.getAddress());
		student.setName(studentModel.getName());

		student = StudentRepository.save(student);

		if (student != null && student.getName() != null) {

			return "Student data is saved successfully.";

		} else {
			return "Student data is not saved successfully.Please try again";

		}

	}

}
