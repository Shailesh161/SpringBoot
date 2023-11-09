package com.example.person.person.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Person_Name 
{
	private String firstName;
	private String lastName;
	
	public Person_Name() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Person_Name(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	@Override
	public String toString() 
	{
		return "Person_Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
