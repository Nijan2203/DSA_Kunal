package conditionalsandloops;

import java.util.Scanner;

public class AreaofParallelogram {
//	Area Of Parallelogram
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the base");
			int b = in.nextInt();
			System.out.println("Enter the height");
			int h= in.nextInt();
			double area = isarea(b,h);
			System.out.println("Area of the Parallelogram is "+area);
		}

			static double isarea(int b, int h) {
				return b*h;
			}

	}


