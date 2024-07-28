package firstjava;

import java.util.Scanner;

public class SimpleInterset {
//	Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the principle");
		int p = in.nextInt();
		System.out.println("Enter the time");
		int t = in.nextInt();
		System.out.println("Enter the interest rate");
		int r = in.nextInt();

		double res = simpleinterest(p, t, r);
		System.out.println("Simple Interest of the Given principle is " + res);
	}

	static double simpleinterest(int p, int t, int r) {
		double res = 0;
		if (p != 0) {
			res = (p * t * r) / 100;
		}
		return res;
	}

}
