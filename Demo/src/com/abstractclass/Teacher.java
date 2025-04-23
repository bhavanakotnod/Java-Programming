package com.abstractclass;

public class Teacher extends Person{
	private String name;
    private String subject1;
    private String subject2;

    public Teacher(String name, String subject1, String subject2) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    @Override
    public void personDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subjects: " + subject1 + ", " + subject2);
    }

}
