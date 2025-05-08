package superAndThis;
//child class inherited by parent class Animal
// parent class constructor is called using Super keyword
public class Dog extends Animal {
	public Dog() {
		super();
		System.out.println("Dog is created...");
	}
	public static void main(String[] args) {
		Dog d= new Dog();
		
	}
	

}
