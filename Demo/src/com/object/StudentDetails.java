package com.object;
import com.Methods.*;           //import the student details from method package
public class StudentDetails {
	public static void main(String[] args) {
		Student s= new Student();  //student is the class present in the package of method
		s.m1("Bhavana",123,"Computer");
		Student s1 =new Student();
		s1.m1("Shiva", 124, "Electric");
		Student s2 =new Student();
		s2.m1("Sandhya", 143, "IT");
		Student s3 =new Student();
		s3.m1("Shruti", 122, "Mechanical");
		Student s5 =new Student();
		s5.m1("Baswa", 120, "Fitter");
		Student s6 =new Student();
		s6.m1("Hina", 127, "civil");
	}
	

}
