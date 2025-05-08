package superAndThis;
//Class Student with field name and age
//Constructor have the same name as class fields

public class Student {
	String name;    //fields
	int age;
	public Student(String name,int age){
		this.name =name;
		this.age =age;
		
	}
	public void display() {
		System.out.println("name of the student "+name);
		System.out.println("age of the student "+age);
	}
	public static void main(String[] args) {
		Student s= new Student("Bhavana",21);
		s.display();
	}

}
