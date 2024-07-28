package conditionalsandloops;

import java.util.Scanner;

public class AreaofRectangle {
//	Area Of Rectangle Program
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the base");
	int b = in.nextInt();
	System.out.println("Enter the length");
	int l = in.nextInt();
	double area = isarea(b,l);
	System.out.println("Area of the recatangle is "+area);
}

	static double isarea(int b, int l) {
		return b*l;
	}




}
