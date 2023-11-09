package com.example.create.student.student_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.create.student.student_db.pojo.Student;

public interface StudentRepository extends JpaRepository<Student,Integer >
{
	
}
