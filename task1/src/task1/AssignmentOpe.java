package task1;

public class AssignmentOpe {
	public static void main(String args[])
	{
		int a = 8;
		int b = 5;
		int c;
		c = a;
		System.out.println("c = a  is = " + c);
		c+=b;
		System.out.println("c after c +=  b is = "+ c);
		c*=a;
		System.out.println("c after c *=  a is  = " + c);
		c -= b;
		System.out.println("c after c -= b is = " + c);
		c /= a;
		System.out.println("c after c /= a is  = " + c);
		c %= b;
		System.out.println("c after c %= b is = " + c);
	}

}
