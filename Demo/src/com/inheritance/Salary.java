package com.inheritance;

public class Salary extends Employee {
	double hra,da, basic_pay;
	
	Salary(int empid, String empName ,double hra,double da, double basic_pay){
	     super (empid , empName);
		this. hra = hra;
		this.da = da;
		this.basic_pay =basic_pay;
		
	}
	public double displayTotalSalary() {
		return basic_pay + hra +da;
	}
	public void displaySalaryDetails() {
		System.out.println();
		System.out.println("name of employee "+empName);
		System.out.println("basic pay  of employee"+ basic_pay);
		System.out.println("hra "+ hra);
		System.out.println("da "+da);
		System.out.println("total salary "+(displayTotalSalary()));
	}
	
	

}
