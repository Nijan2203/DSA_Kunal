package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
//	Perimeter Of Equilateral Triangle

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int s = in.nextInt();

		double perimeter = isperimeter(s);
		System.out.println("Perimeter of the Equilateral Triangle " + perimeter);

	}

	static double isperimeter(int a) {
		
		return 3*a;
	}

}
