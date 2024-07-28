package firstjava;

import java.util.Scanner;

public class Fibonacci {

//	To calculate Fibonacci Series up to n numbers. 0,1,1,2,3,5,8,13,21
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int res = fibonacci(n);
		System.out.println("Fibonacci value is " + res);
	}

	static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int count = 2;
		int nextnum = 0;
		while (count <= n) {

			nextnum = b + a;
			a = b;
			b = nextnum;
			count++;
		}
		return nextnum;
	}

}
