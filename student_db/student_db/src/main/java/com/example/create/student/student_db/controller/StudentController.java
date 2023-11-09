package com.example.create.student.student_db.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.create.student.student_db.service.StudentService;

import com.example.create.student.student_db.pojo.Student;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get-all-students-from-DB")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> studList =studentService.getAllStudents();
		if(studList.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(studList));
		
	}
	
	@GetMapping("/get-students-from-DB-by-id/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable Integer id)
	{
		Optional<Student> studLists =studentService.getStudentById(id);
		if(studLists.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(studLists));
		
	}
	
	
	
//	public ResponseEntity<Student> createStudent(@RequestBody Student student)
//	{
		
		
//		try {
//			ResponseEntity<Student> stud =null;
//			stud= studentService.createStudent(student);
//			return ResponseEntity.ok(Optional.of(stud));
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
		
	
	//}
	
	@PostMapping("/create-student-using-database")
	public ResponseEntity<Student> createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student);
		
	}
	
	@PutMapping("/update-student-using-database/{id}")
	public Student updateStudent(@RequestBody Student student ,@PathVariable Integer id)
	{
		return studentService.updateStudent(student,id);
	}
	
	@DeleteMapping("delete-student-from-database/{id}")
	public Integer deleteStudent (@PathVariable Integer id)
	{
		return studentService.deleteStudent(id);
		
	}
}
