package firstjava;

import java.util.Scanner;

public class GreetingName {

//	Take name as input and print a greeting message for that particular name.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = in.nextLine();
		String greeting = isgreet(name);
		System.out.println(greeting);

	}

	static String isgreet(String name) {
		return "Good Morning " + name;
	}

}
