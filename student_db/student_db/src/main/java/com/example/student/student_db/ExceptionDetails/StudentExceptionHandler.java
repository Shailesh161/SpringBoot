package com.example.student.student_db.ExceptionDetails;

import java.net.http.HttpHeaders;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionDetails> handleAllStudentException(Exception ex ,WebRequest request) throws Exception
	{
		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exceptionDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<ExceptionDetails> handleStudentNotFoundException(Exception ex ,WebRequest request) throws Exception
	{
		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exceptionDetails,HttpStatus.NOT_FOUND);
	}
	

	
	public ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) 
	{
		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(exceptionDetails,HttpStatus.BAD_REQUEST);
		
	}
	
}
