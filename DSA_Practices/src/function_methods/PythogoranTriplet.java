package function_methods;

import java.util.Scanner;

public class PythogoranTriplet {

//	Write a function to check if a given triplet is a Pythagorean triplet or not. 
//	(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int r = in.nextInt();
		System.out.println("Enter the Number2");
		int p = in.nextInt();
		System.out.println("Enter the Number3");
		int q = in.nextInt();
		if(Pythagoren(r,p,q)) {
			System.out.println("Given triplet is a Pythagorean");
		}else {
			System.out.println("Given triplet is not a Pythagorean");
		}
	}
	
	
	public static boolean Pythagoren(int a, int b, int c) {
		int first = a*a;
		int second = b*b;
		int third = c*c;
		int result=0;
		if(a>b && a>c) {
			result =  second+third;
			if(result==first) {
				return true;
			}
		}else if(b>c){
			result = first+third;
			if(result==second) {
				return true;
			}
		}else {
			result = first+second;
			if(result==third) {
				return true;
			}
		}
		
		
		
		return false;
	}

}
