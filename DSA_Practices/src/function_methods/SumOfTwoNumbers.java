package function_methods;

import java.util.Scanner;

public class SumOfTwoNumbers {

//	Write a program to print the sum of two numbers entered by user by defining your own method.


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int a = in.nextInt();
		System.out.println("Enter the Number2");
		int b = in.nextInt();
		
		int sum = sum(a,b);
			System.out.println("Sum of the given number is: "+sum);
		
		
	}
	
	
	
	public static int sum(int a, int b) {
		int sum = 0;
		sum = a+b;
		return sum;
	}

}
