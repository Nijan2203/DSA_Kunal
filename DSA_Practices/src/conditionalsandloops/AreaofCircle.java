package conditionalsandloops;

import java.util.Scanner;

public class AreaofCircle {

//	Area Of Circle Java Program
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();
		
		double area = isarea(r);
		System.out.println("Area of the circle  is "+area);
	}

	 static double isarea(int r) {
		 double area = Math.PI*r*r;
		 return area;
	}

}
