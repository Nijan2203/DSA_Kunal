package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
//Perimeter Of Parallelogram

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the base");
		int b = in.nextInt();
		System.out.println("Enter the side");
		int a = in.nextInt();
		double perimeter = isperimeter(b,a);
		System.out.println("Perimeter of the Parallelogram " + perimeter);

	}

	static double isperimeter(int a, int b) {
		
		return 2*(a+b);
	}

}
