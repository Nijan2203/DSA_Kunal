package function_methods;

import java.util.Scanner;

public class FactorialNumber {

//	Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//	4! = 1 * 2 * 3 * 4 = 24 
//	3! = 3 * 2 * 1 = 6 
//	2! = 2 * 1 = 2 
//	Also, 
//	1! = 1 
//	0! = 1

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int r = in.nextInt();

		int fact = factorial(r);
		System.out.println("Factorial of given number is " + fact);
	}

	public static int factorial(int n) {

		int res = 1;

		while (n > 0) {

			res = res * n;

			n--;
		}
		return res;

	}

}
