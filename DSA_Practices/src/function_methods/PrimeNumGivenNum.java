package function_methods;

import java.util.Scanner;

public class PrimeNumGivenNum {

//	Write a function that returns all prime numbers between two given numbers.
	public static void main(String[] args) {
Scanner ip  = new Scanner(System.in);
System.out.println("Enter the start number");
int start = ip.nextInt();
System.out.println("Enter the last number");
int last = ip.nextInt();

for(int i=start; i<=last; i++) {
	if(isprime(i)) {
		System.out.println("Given number "+i+" is prime");
	}else {
		System.out.println("Given number "+i+" is not a prime");
	}
}
}
	
	
	static boolean isprime(int a) {
		if(a==1 ||a==0) {
			return false;
		}
		if(a==2) {
			return true;
		}
		int c=2;
		while(a>c) {
			if(a%c==0) {
				return false;
			}c++;
			
		}
		return true;
		
	}
}