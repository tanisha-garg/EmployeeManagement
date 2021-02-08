package com.empmgt.entities;

public class Department {
	
	//Declaring fields of Department class
	private String deptId;
	private String deptName;
	
	public Department(String deptId, String deptName){
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	//Getters and Setters
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		String text = "Department Id and Name: "+deptId +" "+deptName;
		return text;
	}

}
