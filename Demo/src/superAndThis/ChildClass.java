package superAndThis;
//subclass
public class ChildClass extends ParentClass {
	String name ="child" ;
	public void printName() {
		System.out.println("using this.name for refering current class variable "+this.name);
		System.out.println("using super.name used to refere  parent class variables "+super.name);
	}
	public static void main(String[] args) {
		ChildClass c =new ChildClass();
		c.printName();
	} 
	

}
