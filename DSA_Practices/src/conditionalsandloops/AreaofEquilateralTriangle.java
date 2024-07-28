package conditionalsandloops;

import java.util.Scanner;

public class AreaofEquilateralTriangle {
//	Area Of Equilateral Triangle
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side");
		int a = in.nextInt();
		
		double area = isarea(a);
		System.out.println("Area of the Equilateral Triangle  is "+area);
	}

 static double isarea(int a) {
	return (Math.sqrt(3)*a*a)/4;
}
	}


