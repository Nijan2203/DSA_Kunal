package conditionalsandloops;

import java.util.Scanner;

public class MaximumofNumber {
//	Take integer inputs till the user enters 0 and print the largest number from all.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=1;
		int max = 0;
		while(a!=0) {
			a= in.nextInt();
			max = max(a, max);
			
		}
		System.out.println(max);
	}

 static int max(int a, int max) {
	
	 if(max<a) {
		 max = a;
	 }
	 
	return max;
}
}
