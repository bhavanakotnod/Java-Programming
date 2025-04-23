package com.abstractclass;

public abstract class Employee {
	public abstract void calculateSalary(String salary);
	
	public void employeedetails(String emp_name,int emp_Id,String job_role,String job_Status) {
		System.out.println("name of Employee "+ emp_name);
		System.out.println("Employee id "+ emp_Id);
		System.out.println("Employee job role "+ job_role);
		//System.out.println("work schedule of employee "+job_Status);
		
	   
	}


}
