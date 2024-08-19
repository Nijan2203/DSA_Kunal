package conditionalsandloops;

import java.util.Scanner;

public class SubstractProjectSum {
//	Subtract the Product and Sum of Digits of an Integer
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the number");
int a = in.nextInt();


int res = sub(a);
		System.out.println("Subtract the Product and Sum of Digits of an Integer is "+res);
	}
	
	static int sub(int a) {
		int temp=a;
		int digit = 0;
		int pro = 1,sum = 0, res,rem;
//		while(temp>0) {
//			temp = temp/10;
//			digit++;
//		}
		temp=a;
		
		while(temp>0) {
			rem = temp%10;
			pro = pro*rem;
			sum = sum+rem;
			temp = temp/10;
		}
		
		res = pro-sum;
		
		
		
		return res;
		
		
	}

}
