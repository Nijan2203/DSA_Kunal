package conditionalsandloops;

import java.util.Scanner;

public class VolumnofPrism {
//	Volume Of Prism 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the base");
		int b = in.nextInt();
		System.out.println("Enter the height");
		int h = in.nextInt();
		double volumn = isvolumn(b,h);
		System.out.println("Volumn of the Prism is "+ volumn);
	}

 static double isvolumn(int b, int h) {
	
	return b*h;
}

}
