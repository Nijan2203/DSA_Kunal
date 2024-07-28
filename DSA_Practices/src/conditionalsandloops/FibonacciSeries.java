package conditionalsandloops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		int res = fibonacci(n);
		System.out.println("Fibonacci series of "+n+" is "+ res);
		
		
		

	}

	 static int fibonacci(int n) {
		int a =0;
		int b = 1;
		 int count = 2;
		int nextnum = 0;
		while(count<=n) {
			nextnum = a+b;
			a=b;
			b=nextnum;
			count++;
		}
		
		return nextnum;
		
	}

}
