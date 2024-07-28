package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfCircle {
//	Perimeter Of Circle

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();

		double perimeter = isperimeter(r);
		System.out.println("Perimeter of the Circle " + perimeter);

	}

	static double isperimeter(int r) {
		
		return 2 * Math.PI * r;
	}

}
