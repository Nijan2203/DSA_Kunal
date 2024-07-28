package conditionalsandloops;

import java.util.Scanner;

public class SumofInputs {
//	Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = 1;
		int res = 0;
		while (a != 0) {
			a = in.nextInt();
			res = sum(a, res);

		}

		System.out.println(res);

	}

	private static int sum(int a, int res) {

		res = res + a;
		return res;
	}

}