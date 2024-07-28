package firstjava;

import java.util.Scanner;

public class Calculator {

//	Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int first = in.nextInt();
		System.out.println("Enter the second Number");
		int second = in.nextInt();
		System.out.println("Enter the operator");
		String op = in.next();
		int res = calculate(first, second, op);
		System.out.println("Result of the given input " + res);

	}

	static int calculate(int first, int second, String op) {
		int res = 0;
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			if (op.equals("+")) {
				res = first + second;

			} else if (op.equals("-")) {
				res = first - second;
			} else if (op.equals("*")) {
				res = first * second;
			} else if (op.equals("/")) {
				if(second!=0)
				res = first / second;
				else {
					return 0;
				}
			}
				
		}else {
			System.out.println("Please pass the valid operator");
		}
		return res;
	}  
}