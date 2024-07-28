package conditionalsandloops;

import java.util.Scanner;

public class PerimeterOfRectangle {
//Perimeter Of Rectangle

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length");
		int l = in.nextInt();
		System.out.println("Enter the width");
		int w = in.nextInt();
		double perimeter = isperimeter(l,w);
		System.out.println("Perimeter of the Rectangle " + perimeter);

	}

	static double isperimeter(int l, int w) {

		return 2*(l+w);
	}

}
