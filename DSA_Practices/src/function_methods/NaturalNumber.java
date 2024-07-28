package function_methods;

import java.util.Scanner;

public class NaturalNumber {
//	Write a function that returns the sum of first n natural numbers.
	
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the Number");
int n = in.nextInt();

int nat = isnaturalNumber(n);
System.out.println("Sum of first "+n+" natural numbers "+ nat);


	
	}

	
	static int isnaturalNumber(int a) {
		int res=0;
		while (a>0) {
			res +=a;
			a--;
		}
		return res;
	}
}

