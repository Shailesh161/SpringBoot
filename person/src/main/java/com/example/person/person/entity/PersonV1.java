package com.example.person.person.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Info_Table")
public class PersonV1 
{
	@Id
	private String ID;
	private String name;
	private String Address;
	
	public PersonV1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonV1(String iD, String name, String address) {
		super();
		ID = iD;
		this.name = name;
		Address = address;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() 
	{
		return "PersonV1 [ID=" + ID + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	
}
