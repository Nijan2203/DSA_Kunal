package arrays;

public class AssE4WealthofCustomer {
//	Richest Customer Wealth - https://leetcode.com/problems/richest-customer-wealth/description/
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {3,2,1,8}};
		int max = cusWealth(arr);
System.out.println("Max Wealth value is "+ max);
	}
	
	static int cusWealth(int[][] arr) {
		int max = Integer.MIN_VALUE;

		for(int row = 0; row<arr.length; row++) {
			int sum = 0;
			for(int col = 0;  col<arr[row].length; col++) {
				sum = sum+arr[row][col];
			}
			if(sum>max) {
				max = sum;
			}
		}
		return max;
	}

}
