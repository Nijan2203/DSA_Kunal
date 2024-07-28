package function_methods;

import java.util.Scanner;

public class ElegibleForVote {

//	A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = in.nextInt();
		
		boolean vote = iseligibletovote(a);
		if(vote) {
			System.out.println("The person is eligible to vote");
		}else {
			System.out.println("The person is not eligible to vote");
		}
	}

	
	static boolean iseligibletovote(int a) {
		if(a>=18) {
			return true;
		}else {
			return false;
		}
	}
}
