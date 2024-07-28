package function_methods;

import java.util.Scanner;

public class PrimeNumber {

//	Define a method to find out if a number is prime or not.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int r = in.nextInt();

		isPrime(r);
	}

	static void isPrime(int a) {
		int c = 2;
		while (c <= Math.sqrt(a)) {
			if (a % c == 0) {
				System.out.println("Given number is not a prime");
					return;
			}
			c++;
			

		}System.out.println("Given number is prime");
	}
}