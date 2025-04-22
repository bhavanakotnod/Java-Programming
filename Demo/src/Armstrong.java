
public class Armstrong {
	public static void main(String[] args) {
		int num=46;
		int orNo=num;
		int length=0;
		int total=0;
		//length of the number
		while(num!=0) {
			num=num/10;
		  length=length+1;
		}
		System.out.println(length);
		num=orNo;
		while(num!=0) {
			int rem=num%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				 mul=mul*rem;
				
			}
			total =total+mul;
			num=num/10;
			
		}System.out.println(total);
		if(orNo==total) {
			System.out.println("the given number is armstrong");
		}else {
			System.out.println("the number is not armstrong num");
		}
	}

}
