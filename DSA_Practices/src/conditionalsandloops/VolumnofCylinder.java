package conditionalsandloops;

import java.util.Scanner;

public class VolumnofCylinder {
//	Volume Of Cylinder
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();
		System.out.println("Enter the height");
		int h = in.nextInt();
		double volumn = isvolumn(r,h);
		System.out.println("Volumn of the Cylinder is "+ volumn);
	}

 static double isvolumn(int r, int h) {
	
	return Math.PI*r*r*h;
}

}
