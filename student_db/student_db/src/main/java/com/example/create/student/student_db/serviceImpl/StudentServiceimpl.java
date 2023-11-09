package com.example.create.student.student_db.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.create.student.student_db.pojo.Student;
import com.example.create.student.student_db.repository.StudentRepository;
import com.example.create.student.student_db.service.StudentService;
import com.example.student.student_db.ExceptionDetails.StudentNotFoundException;

@Service
public class StudentServiceimpl implements StudentService

{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() 
	{
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	
	}

	@Override
	public Optional<Student> getStudentById(Integer id) 
	{
		Optional<Student> student =studentRepository.findById(id);
		if(student.isEmpty())
		{
			throw new StudentNotFoundException("Student not Found ,ID of Student is :"+id);
		}
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public ResponseEntity<Student> createStudent(Student student) 
	{
		// TODO Auto-generated method stub
		Student student1=studentRepository.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(student);
		//return ResponseEntity.created(null).build();
		
	}

	@Override
	public Student updateStudent(Student student, Integer id) 
	{
		// TODO Auto-generated method stub
		List<Student> studentList = getAllStudents();
		for(Student stud : studentList)
		{
			if(stud.getId().equals(id)) 
			{
				stud.setName(student.getName());
				stud.setAddress(student.getAddress());
				studentRepository.save(stud);
				return stud;
			}
		}
		return null;
	}

	@Override
	public Integer deleteStudent(Integer id) 
	{
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return id;
	}
	
}
