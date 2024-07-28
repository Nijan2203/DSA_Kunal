package conditionalsandloops;

import java.util.Scanner;

public class VolumnofSphere {
//	Volume Of Sphere 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();
		double volumn = isvolumn(r);
		System.out.println("Volumn of the Sphere is "+ volumn);
	}

 static double isvolumn(int r ) {
	
	return (4*Math.PI*Math.pow(r, 3))/3;
}

}
