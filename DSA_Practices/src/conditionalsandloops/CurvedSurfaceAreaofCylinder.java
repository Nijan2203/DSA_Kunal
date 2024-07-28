package conditionalsandloops;

import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {

//	Curved Surface Area Of Cylinder
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();
		System.out.println("Enter the height");
		int h = in.nextInt();
		double area = isarea(r,h);
		System.out.println("Curved Surface Area Of Cylinder is "+ area);
	}

	 static double isarea(int r, int h) {
		return 2*Math.PI*r*h;
	}

}
