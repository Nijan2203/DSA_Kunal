package function_methods;

import java.util.Scanner;

public class CircleAreaAndCircumference {

//	Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int r = in.nextInt();
		
		double area = isarea(r);
		System.out.println("Area of the circle is "+ area);
		double cercum = iscircumference(r);
		System.out.println("Circumference of the circle is "+ cercum);
	}

	
	public static double isarea(int r) {
	double area = Math.PI*r*r;
	return area;
	}
	public static double iscircumference(int r) {
		double cercum = 2*Math.PI*r;
		return cercum;
		}
}
