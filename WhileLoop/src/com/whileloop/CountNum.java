package com.whileloop;
import java.util.Scanner;


public class CountNum {
    public static void main(String[] args) {
        // scanner class is used to get input from user
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

       
        while (number != 0) {
            sum += number % 10;  
            number /= 10;         
        }

        
        System.out.println("Sum of digits: " + sum);

        
        scanner.close();
    }
}

