package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

//	@Value (value = "10")
	private int id ;
//	@Value (value = "Ram")
	private String name;
//	@Value (value = "Pune")
	private String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
