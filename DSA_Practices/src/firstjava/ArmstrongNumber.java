package firstjava;

import java.util.Scanner;

public class ArmstrongNumber {

//	To find Armstrong Number between two given number.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		if(isArmstrong(n)) {
			System.out.println("Given number is an  Armstrong Number");
		}else {
			System.out.println("Given number is not an Armstrong Number");
		}
	}

	
	static boolean isArmstrong(int n) {
		int digit=0, temp=n;
		double res = 0;
		
		
	while(temp>0) {
		temp = temp/10;
		digit++;
	}
	
	temp = n;
	
	while(temp>0) {
	int	rem =  temp%10;
		res = res+Math.pow(rem, digit);
		temp = temp/10;
	}
		
	if (res ==n) {
		return true;
		
	}else {
		return false;
	}
		
	}
	
}
