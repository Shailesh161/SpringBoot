package com.example.student.StudentCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.student.StudentCrudOperation.Service.StudentService;
import com.example.student.StudentCrudOperation.pojo.Student;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/create-student")
	public List<Student> createStudent(Integer id, String address, String name)
	{
		return studentService.CreateStudent(id, name, address);
	}
	
	@GetMapping("/get-all-Students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@PutMapping("/update-Student/{id}")
	public Student updateStudent(@PathVariable Integer id)
	{
		return studentService.updateStudent(id);
	}
	
	@DeleteMapping("/delete-Student/{id}")
	public Integer deleteStudent(@PathVariable Integer id)
	{
		studentService.deleteStudent(id);
		return id;
	}
}
