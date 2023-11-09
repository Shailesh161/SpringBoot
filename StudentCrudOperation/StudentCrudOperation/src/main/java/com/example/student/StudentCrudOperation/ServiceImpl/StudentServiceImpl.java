package com.example.student.StudentCrudOperation.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.StudentCrudOperation.Service.StudentService;
import com.example.student.StudentCrudOperation.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService
{
	private static List<Student> studentList =new ArrayList<Student>();
	
	static
	{
		studentList.add(new Student(1,"Shailesh","Pune"));
		studentList.add(new Student(2,"Dhiraj","Mumbai"));
		studentList.add(new Student(3,"Yash","Delhi"));
		studentList.add(new Student(4,"Mahesh","Gujrat"));
		
	}

	@Override
	public List<Student> CreateStudent(Integer id, String name, String address) 
	{
		Student student=new Student(5,"Raj","Dharashiv");
		studentList.add(student);//remember to add new created studentt in studentlist
		return studentList;
	}

	@Override
	public List<Student> getAllStudents() 
	{
		return studentList;
	}

	@Override
	public Student updateStudent(Integer id) 
	{
		for(Student stdnt : studentList)
		{
			if(stdnt.getId().equals(id))
			{
				stdnt.setAddress("updated Address");
				return stdnt;
			}
		}
		return null;
	}

	@Override
	public Integer deleteStudent(Integer id) 
	{
		for(Student stdnt : studentList)
		{
			if(stdnt.getId().equals(id))
			{
				studentList.remove(id);
			}
		}
		return id;
	}
}
