package com.inheritance;

public class Employee {
	
		 int empid ;
		 String empName ;
	
		 Employee(int empid , String empName) {
			empid = empid;
			empName = empName;
		}
		void displayEmployeeDetails() {
		System.out.println("Employee id "+empid);
		System.out.println("Employee name "+empName);
		}
	}


