package function_methods;

import java.util.Scanner;

public class MinAndMaxNumber {
	
//	Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Number 1:");
		int n1 = in.nextInt();
		System.out.println("Enter the Number 2:");
		int n2 = in.nextInt();
		System.out.println("Enter the Number 3:");
		int n3 = in.nextInt();
		
		int max = max(n1,n2,n3);
		System.out.println("Maxmimum Number is "+ max );
		int min = min(n1,n2,n3);
		System.out.println("Minimum Number is "+ min );
	}

	
	static int max(int a, int b, int c) {
		int max = 0;
		if(a>=b && a>=c) {
		max = a;
		}else if(b>=c) {
			max = b;
		}else {
			max = c;
		}
		return max;
	}
	
	static int min(int a, int b, int c) {
		int min = 0;
		if(a<=b && a<=c) {
		min = a;
		}else if(b<=c) {
			min = b;
		}else {
			min = c;
		}
		return min;
	}
	
}
