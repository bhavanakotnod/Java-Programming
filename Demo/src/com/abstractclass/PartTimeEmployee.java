package com.abstractclass;
import java.util.Scanner;
public class PartTimeEmployee extends Employee {

	

	@Override
	public void calculateSalary(String salary) {
		System.out.println("Salary for part time employeement is "+salary);
		
		
	}
	public static void main(String[] args) {
		
		String fulltime = "fulltime";
		String parttime = "parttime";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the job status : ");		 
		 String job_Status = sc.nextLine();
		 
		 if(job_Status.equals(fulltime)) {
		 
		FullTimeEmployee f = new FullTimeEmployee();
		f.employeedetails("Bhavana", 123, "Employee", "part  time");
		f.calculateSalary("15LPA");
		 }
		 if(job_Status.equals(parttime)) {
		
		PartTimeEmployee p = new PartTimeEmployee();
		p.employeedetails("Shiva", 120, "Intern", "part time");
		p.calculateSalary("14K");
		 }
		
		 else {
			 System.out.println("job Status not matches....");
		 }		 

	}

}
