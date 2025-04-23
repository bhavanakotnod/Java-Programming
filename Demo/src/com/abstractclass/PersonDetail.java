package com.abstractclass;
import java.util.Scanner;
public class PersonDetail {
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        Person person;

	        System.out.println("Enter person type (student/teacher):");
	        String type = sc.nextLine();

	        if (type.equals("student")) {
	            System.out.println("Enter student name:");
	            String name = sc.nextLine();

	            System.out.println("Enter roll number:");
	            int roll_no = sc.nextInt();
	            sc.nextLine(); // consume leftover newline

	            person = new Student(name, roll_no);

	        } else if (type.equals("teacher")) {
	            System.out.println("Enter teacher name:");
	            String teacher_name = sc.nextLine();

	            System.out.println("Enter subject 1:");
	            String sub1 = sc.nextLine();

	            System.out.println("Enter subject 2:");
	            String sub2 = sc.nextLine();

	            person = new Teacher(teacher_name, sub1, sub2);
	        } else {
	            System.out.println("Person type does not match...");
	            sc.close();
	            return;
	        }

	        person.personDetails();
	        sc.close();
	    }
	}
