package com.abstractclass;

public class Cow extends Animal{

	@Override
	public void makesound() {
		System.out.println("cow sounds : moo-moo");
		
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makesound();
		 Cat c = new Cat();
		 c.makesound();
		 Cow o = new Cow();
		 o.makesound();
	}

}
