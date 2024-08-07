package arrays;

import java.util.Arrays;

public class AssE21TwoSums {
//	Two Sum
	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		int target = 6;
		
		
		int[] out  = issum(nums, target);
		System.out.println("Sum of two element matches with the target is " +Arrays.toString(out));
	}

	static int[] issum(int[] arr,int target) {
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr.length>=i+1) {
				for(int j=i+1; j<arr.length; j++) {
			int ans = arr[i]+arr[j];
			if(ans == target) {
				return new int[] {i, j};
			}
				}
		}
		}
		return new int[] {-1,-1};
	}
	
}
