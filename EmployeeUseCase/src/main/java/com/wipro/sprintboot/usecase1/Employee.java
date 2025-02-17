package com.wipro.sprintboot.usecase1;

//package com.example.demo;

public class Employee {
	private int id;
	private String name;
	private String role;
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
	public String getCity() {
		return role;
	}
	public void setCity(String city) {
		this.role = city;
	}
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.role = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
