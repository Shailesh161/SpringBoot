package com.example.create.student.student_db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.create.student.student_db.pojo.Student;


public interface StudentService 
{
	public List<Student> getAllStudents();
	
	public Optional<Student> getStudentById(Integer id);
	
	public ResponseEntity<Student> createStudent(Student student);
	
	public Student updateStudent(Student student ,Integer id);
	
	public Integer deleteStudent(Integer id);
	
}
