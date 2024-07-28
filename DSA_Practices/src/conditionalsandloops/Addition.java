package conditionalsandloops;

import java.util.Scanner;

public class Addition {
//	Addition Of Two Numbers
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number1");
		int a = in.nextInt();
		System.out.println("Enter the number2");
		int b = in.nextInt();
		
	int add = add(a, b);
	System.out.println("Addition of Two number is "+ add);
	}

	 static int add(int a, int b) {
int add = a+b;
		 return add;
	}

}
