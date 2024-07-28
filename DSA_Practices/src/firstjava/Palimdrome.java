package firstjava;

import java.util.Scanner;

public class Palimdrome {
//	To find out whether the given String is Palindrome or not.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = in.next();
		
		ispalindrome(name);

	}
	
	static void ispalindrome(String name) {
		
		String res = "" ;
	for(int i=name.length()-1; i>=0; i--) {
		res = (String) (res+name.charAt(i));
		
	}
		if(name.equals(res)) {
			System.out.println("Given String is a Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
			
	}

}
