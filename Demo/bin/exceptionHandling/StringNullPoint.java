package exceptionHandling;
// Initialize string to null
//call length on it

public class StringNullPoint {
	public static void main(String[] args) {
		String s =null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This block always execute");
		}
	}

}
