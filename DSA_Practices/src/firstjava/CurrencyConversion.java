package firstjava;

import java.util.Scanner;

public class CurrencyConversion {
//	Input currency in rupees and output in USD.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Indian Rupees");
		int n = in.nextInt();
		
		double res = curconv(n);
		System.out.println(res +"is the dollor value of the given Indian rupees");
	}

 static double curconv(int n) {
	 
	double res = 0;
	
	res =  n/84;
	
	return res;

	 
}

}
