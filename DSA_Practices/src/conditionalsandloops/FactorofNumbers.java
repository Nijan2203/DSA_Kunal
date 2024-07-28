package conditionalsandloops;

import java.util.Scanner;

public class FactorofNumbers {
//	Input a number and print all the factors of that number (use loops).

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the number");
int n = in.nextInt();
factor(n);

	}

	static void factor(int n) {
		int count = 1;
	
		while(count<=n) {
			if(n%count==0) {
			System.out.println(count);	
			
			}count++;
	}
	
}
}