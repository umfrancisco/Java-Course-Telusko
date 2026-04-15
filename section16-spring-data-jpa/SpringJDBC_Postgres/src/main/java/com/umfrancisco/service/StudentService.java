package com.umfrancisco.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umfrancisco.model.Student;
import com.umfrancisco.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository repository;
	
	public StudentRepository getRepository() {
		return repository;
	}
	
	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}
	
	public void addStudent(Student s) {
		repository.save(s);
	}
	
	public List<Student> getStudents() {
		return repository.findAll();
	}
}
