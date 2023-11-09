package com.example.student.student_db.ExceptionDetails;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException
{
	public StudentNotFoundException(String message)
	{
		super(message);
	}
}
