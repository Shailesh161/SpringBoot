package com.example.person.person.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Version2_Table")
public class PersonV2 
{
	@Id
	private Integer ID;
	private Person_Name name;
	private String address;
	
	public PersonV2() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonV2(Integer id, Person_Name name, String address) {
		super();
		ID = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return ID;
	}

	public void setId(Integer id) {
		ID = id;
	}

	public Person_Name getName() {
		return name;
	}

	public void setName(Person_Name name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonV2 [Id=" + ID + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
