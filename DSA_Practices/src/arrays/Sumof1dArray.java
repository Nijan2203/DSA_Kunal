package arrays;

public class Sumof1dArray {
//	Running Sum of 1d Array
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,9};
		
		int sum = sumarray(a);
		System.out.println("Running Sum of 1d Array is "+sum);
		
	}

	 static int sumarray(int[] a) {
		 int res = 0;
		for(int ele : a) {
			res = res+ele;
		}
		 
		return res;
	}

}
