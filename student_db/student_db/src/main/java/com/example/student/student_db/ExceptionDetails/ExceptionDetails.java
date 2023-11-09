package com.example.student.student_db.ExceptionDetails;

import java.time.LocalDateTime;

import org.springframework.validation.FieldError;

public class ExceptionDetails 
{
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExceptionDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	public ExceptionDetails(LocalDateTime now ,String message2, String description , int errorCount,FieldError fielderror)
	{
		
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
