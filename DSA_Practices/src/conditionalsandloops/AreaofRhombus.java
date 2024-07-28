package conditionalsandloops;

import java.util.Scanner;

public class AreaofRhombus {
//	Area Of Rhombus
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the d1");
		int d1 = in.nextInt();
		System.out.println("Enter the d2");
		int d2= in.nextInt();
		double area = isarea(d1,d2);
		System.out.println("Area of the Rhombus  is "+area);
	}

 static double isarea(int d1, int d2) {
	return (d1*d2)/2;
}

	}


