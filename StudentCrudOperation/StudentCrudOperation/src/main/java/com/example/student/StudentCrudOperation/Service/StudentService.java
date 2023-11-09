package com.example.student.StudentCrudOperation.Service;

import java.util.List;
import com.example.student.StudentCrudOperation.pojo.Student;

public interface StudentService 
{
	public List<Student> CreateStudent(Integer id, String name, String address);
	public List<Student> getAllStudents();
	Student updateStudent(Integer id);
	public Integer deleteStudent(Integer id);
	
	
}
