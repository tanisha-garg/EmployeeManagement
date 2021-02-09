package com.empmgt.ui;

import com.empmgt.entities.*;
import com.empmgt.exceptions.*;

public class EmployeeMain {
	
	//Creating an array object
	Employee employees[] = new Employee[4];

	public static void main(String[] args) {
		EmployeeMain project = new EmployeeMain();
		project.start();

	}
	
	public Employee findEmployeeById(int id) throws InvalidException, EmployeeNotFound {
		if(id < 0) {
			throw new InvalidException(id+" is invalid");
		}
		
		for(Employee employee: employees) {
			if(employee.getId() == id) {
				return employee;
			}
		}
		
		throw new EmployeeNotFound("Employee with id "+id+" cannot be found");
		
	}
	
	void start() {		
		
		try {
			
			//Department information
			Department dept1 = new Department("D101", "Developing");
			Department dept2 = new Department("D102", "Testing");
			
			//Employee information
			Employee devEmployee1 = new Developer(1, "Tanisha", dept1, "Java");
			Employee testerEmployee1 = new Tester(2, "Srinidhi", dept2, "STS");
			Employee devEmployee2 = new Developer(3, "Pallavi", dept1, "C++");
			Employee testerEmployee2 = new Tester(4, "Sindhuja", dept2, "Bootstrap");
			
			
			//Inserting the information inside array
			employees[0] = devEmployee1;
			employees[1] = testerEmployee1;
			employees[2] = devEmployee2;
			employees[3] = testerEmployee2;
			
			int findId = 4;
			Employee employee = findEmployeeById(findId);
			
			if(employee instanceof Developer) {
				Developer devEmployee = (Developer)employee;
				displayEmployee(devEmployee);
			}
			
			if(employee instanceof Tester) {
				Tester testerEmployee = (Tester)employee;
				displayEmployee(testerEmployee);
			}
			
//			for(int index = 0; index < employees.length; index++) {
//				Employee iteratedEmployee = employees[index];
//				if(iteratedEmployee instanceof Developer) {
//					Developer devEmployee = (Developer)iteratedEmployee;
//					displayEmployee(devEmployee);
//				}
//				if(iteratedEmployee instanceof Tester) {
//					Tester testerEmployee = (Tester)iteratedEmployee;
//					displayEmployee(testerEmployee);
//				}
//			}
			
		}catch(InvalidException e) {
			System.out.println("You've entered an invalid id");
			System.out.println(e.getMessage());
		}catch(EmployeeNotFound e) {
			System.out.println("Sorry we can't find the Employee");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		
	}
	
	void displayBaseEmployee(Employee employee) {
		System.out.println(employee);
	}
	
	void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		String language = employee.getLanguage();
		System.out.print("Language: "+language);
		System.out.println();
	}
	
	void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		String tools = employee.getTools();
		System.out.print("Tools: "+tools);
		System.out.println();
	}

}
