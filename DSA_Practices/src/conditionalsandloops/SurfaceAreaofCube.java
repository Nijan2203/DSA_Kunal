package conditionalsandloops;

import java.util.Scanner;

public class SurfaceAreaofCube {
//	Total Surface Area Of Cube
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int a = in.nextInt();

		double area = isarea(a);
		System.out.println("Total Surface Area Of Cube is " + area);

	}

	static double isarea(int a) {
		return 6*a*a;
	}


}
