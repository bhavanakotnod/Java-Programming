package com.object;
import com.Methods.University;

public class UniversityDetails {
	public static void main(String[] args) {
		University u = new University();
		System.out.println("Name of University "+(u.uniName = "DBatu"));
		System.out.println("Location of University "+(u.uniLocation = "Lonere"));
		System.out.println("Number of Students in university "+(u.studentNum = 40000));
		System.out.println("Number of Professor present in univesity "+(u.numProfessor = 150));
		System.out.println("Rank of University"+(u.ranking = "3rd"));
		System.out.println("Established year"+(u.year = "1968"));
		System.out.println("Departments "+(u.department = "Engineering"));
		System.out.println("Graduation level "+(u.graduLevel = "Under Graduate"));
		System.out.println("--------------------------------------------");
		
		System.out.println("Name of University "+(u.uniName = "COEP"));
		System.out.println("Location of University "+(u.uniLocation = "Pune"));
		System.out.println("Number of Students in university "+(u.studentNum = 70000));
		System.out.println("Number of Professor present in univesity "+(u.numProfessor = 350));
		System.out.println("Rank of University"+(u.ranking = "1st"));
		System.out.println("Established year"+(u.year = "1960"));
		System.out.println("Departments "+(u.department = "Engineering"));
		System.out.println("Graduation level "+(u.graduLevel = "Under Graduate / Post graduate"));
		
	}
	

}
