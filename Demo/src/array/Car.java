package array;
import java.util.Scanner;
// Car class has variables car name ,color,mileage, price
//Accept details of 3 cars and store in the array
//print the car name with highest mileage.
public class Car {
	String name;
	String color;
	int mileage;
	double price;
	public Car(String name,String color,int mileage, double price) {
		this.name =name;
		this.color = color;
		this.mileage = mileage;
		this.price = price;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car[] car =new Car[3];
		for(int i = 0;i<car.length;i++) {
			System.out.println("enter detils for car "+(i));
			System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Color: ");
            String color = sc.next();
            System.out.print("Mileage: ");
            int mileage = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            car[i] = new Car(name, color, mileage, price);
			}
		  int maxIndex = 0;
	        for (int i = 1; i < car.length; i++) {
	            if (car[i].mileage > car[maxIndex].mileage) {
	                maxIndex = i;
	            }
	        }
	        System.out.println("Car with highest mileage: " + car[maxIndex].name);
	}
	
}

