package Student_database.Versioning.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Student_database.Versioning.pojo.Student;
import Student_database.Versioning.service.Studentservice;

@RestController
public class Controller 
{
	private Studentservice studentservice;
	
	@GetMapping(path="/get-all-students",params="version=3")
	public List<Student> getAllStudentsVersion3()
	{
		return studentservice.getAllStudents();
	}
	
	@GetMapping(path="/get-all-students",params="version=4")
	public List<Student> getAllStudentsVersion4()
	{
		return studentservice.getAllStudents();
	}
	
	
	@GetMapping(path="/get-all-students",headers="X-API-VERSION=5")
	public List<Student> getAllStudentsVersion5()
	{
		System.out.println("This is version 5 using headers versioning.");
		return studentservice.getAllStudents();
	}
	
	@GetMapping(path="/get-all-students",headers="X-API-VERSION=6")
	public List<Student> getAllStudentsVersion6()
	{
		System.out.println("This is version 6 using headers versioning.");
		return studentservice.getAllStudents();
	}
	
}
