package function_methods;

import java.util.Scanner;

public class Palindrome {

//	Write a function to find if a number is a palindrome or not. Take number as parameter.151
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int r = in.nextInt();
		if(ispalindrome(r)) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		
	}
	
	
	public static boolean ispalindrome(int a) {
		int rem, res = 0, temp=a;
		
		while(temp>0) {
			rem = temp%10;
			res = res*10 + rem;
			temp = temp/10;
		}
		
		return (res==a);
	}

}
