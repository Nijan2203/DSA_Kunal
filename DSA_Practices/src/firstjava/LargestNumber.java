package firstjava;

import java.util.Scanner;

public class LargestNumber {
//	Take 2 numbers as input and print the largest number.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int first = in.nextInt();
		System.out.println("Enter the second Number");
		int second = in.nextInt();

		boolean res = ismax(first, second);
		if (res) {
			System.out.println(first + " is the largest number");
		} else {
			System.out.println((second + " is the largest number"));
		}
	}

	static boolean ismax(int first, int second) {
		// TODO Auto-generated method stub
		return first > second;
	}

}
