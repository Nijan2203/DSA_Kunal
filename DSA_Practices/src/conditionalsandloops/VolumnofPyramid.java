package conditionalsandloops;

import java.util.Scanner;

public class VolumnofPyramid {
//	Volume Of Pyramid 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length");
		int l= in.nextInt();
		System.out.println("Enter the width");
		int w = in.nextInt();
		System.out.println("Enter the height");
		int h = in.nextInt();
		double volumn = isvolumn(l,w,h);
		System.out.println("Volumn of the Pyramid is "+ volumn);
	}

 static double isvolumn(int b, int h, int l) {
	
	return (b*h*l)/3;
}

}
