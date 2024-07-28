package firstjava;

import java.util.Scanner;

public class OddOrEven {

//	Write a program to print whether a number is even or odd, also take input from the user.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = in.nextInt();
		if(isEven(a)) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
	}

	 static boolean isEven(int a) {
		// TODO Auto-generated method stub
		return a%2==0;
	}


}
