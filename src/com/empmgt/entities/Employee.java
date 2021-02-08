package com.empmgt.entities;

public class Employee {
	
	//Declaring Employee Fields
	private int id;
	private String name;
	Department department;
	
	//0 Parameter Constructor
	public Employee(){
		this(-1, "null", null);
	}
	
	//Parameterized Constructor
	public Employee(int id, String name, Department department){
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	//Getter and setter methods
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
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		String text = "Employee Id: "+ id +" Name: "+ name +"\n"+ department;
		return text;
	}
	

}
