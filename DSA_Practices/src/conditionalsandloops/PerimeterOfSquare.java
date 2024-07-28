package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfSquare {
//	Perimeter Of Square

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int a = in.nextInt();

		double perimeter = isperimeter(a);
		System.out.println("Perimeter of the Square " + perimeter);

	}

	static double isperimeter(int a) {
		
		return 4*a;
	}

}
