package function_methods;

import java.util.Scanner;

public class GradeConversion {

//	Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//		 
//		Marks        Grade 
//		91-100         AA 
//		81-90          AB 
//		71-80          BB 
//		61-70          BC 
//		51-60          CD 
//		41-50          DD 
//		<=40          Fail 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int r = in.nextInt();

		String grade = isgrade(r);
		System.out.println("Grade of the given mark " + r + "is " + grade);
	}

	static String isgrade(int a) {
		String grade = "";
		if (a > 91 && a <= 100) {
			grade = "AA";
		} else if (a > 81 && a <= 90) {
			grade = "AB";
		} else if (a > 71 && a <= 80) {
			grade = "BB";
		} else if (a > 61 && a <= 70) {
			grade = "BC";
		} else if (a > 51 && a <= 60) {
			grade = "CD";
		} else if (a > 41 && a <= 50) {
			grade = "DD";
		} else {
			grade = "Fail";
		}
		return grade;
	}

}
