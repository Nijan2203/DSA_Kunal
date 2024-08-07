package arrays;

import java.util.Arrays;

public class AssE3Sumof1dArray {
//	Running Sum of 1d Array
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,9};
		
		
		
		int[] sum = sumarray(a);
		System.out.println("Running Sum of 1d Array is "+ Arrays.toString(sum));
		
	}

	 static int[] sumarray(int[] a) {
		 int[] ans = new int[a.length];
	        for(int i = 0; i<a.length; i++){
	            for(int j = 0; j<=i; j++){
	                ans[i] = ans[i]+a[j];
	            }
	        }
	        return ans;
		 

	}

}
