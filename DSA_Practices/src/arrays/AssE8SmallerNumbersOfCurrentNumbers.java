package arrays;

import java.util.Arrays;

public class AssE8SmallerNumbersOfCurrentNumbers {
//	How Many Numbers Are Smaller Than the Current Number
//	https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
	public static void main(String[] args) {
		int[] arr = {8,1,2,2,3};
		int[] out  = smallerdigitcount(arr);
		System.out.println(Arrays.toString(out));

	}
	
	static int[] smallerdigitcount(int[] arr) {
		int[] out = new int[arr.length];
		int k = 0;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					count ++;
				}
			}
				
			out[k] = count;
			k++;
		}
		return out;
	}

}
