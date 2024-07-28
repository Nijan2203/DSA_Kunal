package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfRhombus {
//	Perimeter Of Rhombus

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int a = in.nextInt();

		double perimeter = isperimeter(a);
		System.out.println("Perimeter of the Rhombus " + perimeter);

	}

	static double isperimeter(int a) {

		return 4*a;
	}

}
