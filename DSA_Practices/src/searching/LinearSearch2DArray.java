package searching;

import java.util.Arrays;

public class LinearSearch2DArray {

	public static void main(String[] args) {
		 int[][] arr = {
	                {23, 4, 1},
	                {18, 12, 3, 9},
	                {78, 99, 34, 56},
	                {18, 12}
	        };
	        int target = 18;
	       System.out.println(Arrays.toString(linearSearch2D(arr, target)));

	}

	
	static int[] linearSearch2D(int[][] arr, int target) {
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col]==target) {
					return new int[]{row, col};
				}
			}
		}
		return new int[] {(Integer) null};
	}
}
