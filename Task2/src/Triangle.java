
public class Triangle {
	public static void main(String args[])
	{
		int x = 10;
		int y =10;
		int z = 10;
		if(x == y && y == z)
		{
			System.out.println("Equilateral Triangle");
			
		}
		if(x==y || y == z || z ==x) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}
	}

}
