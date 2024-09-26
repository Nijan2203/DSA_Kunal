package arrays;

import java.util.Arrays;

public class AssE5ShuffleArray {
//	Shuffle the Array - https://leetcode.com/problems/shuffle-the-array/description/
//	[2,3,5,4,1,7]  ----> [2,3,5,4,1,7] 
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		int[] out = shuffle(nums, n);
		System.out.println(Arrays.toString(out));
	}

	static int[] shuffle(int[] nums, int n) {
		int[] out = new int[2 * n];
		for (int i = 0; i < n; i++) {
			out[2 * i] = nums[i];
			out[2 * i + 1] = nums[i + n];
		}

		return out;
	}

}