package function_methods;

import java.util.Scanner;

public class EvenOrOdd {

//	Define a program to find out whether a given number is even or odd.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = in.nextInt();
		boolean res = iseven(a);
		if (res) {
			System.out.println("Given no " + a + " is even");
		} else {
			System.out.println("Given no " + a + " is odd");
		}
	}

	static boolean iseven(int a) {
		return a % 2 == 0;
	}
}
