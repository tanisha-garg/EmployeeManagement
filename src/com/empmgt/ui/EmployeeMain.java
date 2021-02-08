package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain project = new EmployeeMain();
		project.start();

	}
	
	void start() {		
		
		//Creating an array
		Employee employees[] = new Employee[4];
		
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
		
		for(int index = 0; index < employees.length; index++) {
			Employee iteratedEmployee = employees[index];
			if(iteratedEmployee instanceof Developer) {
				Developer devEmployee = (Developer)iteratedEmployee;
				displayEmployee(devEmployee);
			}
			if(iteratedEmployee instanceof Tester) {
				Tester testerEmployee = (Tester)iteratedEmployee;
				displayEmployee(testerEmployee);
			}
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
