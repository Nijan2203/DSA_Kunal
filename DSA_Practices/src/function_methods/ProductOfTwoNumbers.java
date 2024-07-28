package function_methods;

import java.util.Scanner;

public class ProductOfTwoNumbers {

//	Define a method that returns the product of two numbers entered by user.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int a = in.nextInt();
		System.out.println("Enter the Number2");
		int b = in.nextInt();

		int multiply = product(a, b);
		System.out.println("product of the given number is: " + multiply);

	}

	public static int product(int a, int b) {
		int multiply = 0;
		multiply = a * b;
		return multiply;
	}

}
