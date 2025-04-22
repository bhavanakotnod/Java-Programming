package com.MultipleInheritence;

public class Son implements Mother,Father {

	@Override
	public void m1() {
		System.out.println("Multiple inheritence");
		
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.m1();
	}
	

}
