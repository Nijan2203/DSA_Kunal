package sorting;

import arrays.SwapArray;

public class Ass3EContainsDuplicate {
//	ContainsDuplicate - https://leetcode.com/problems/contains-duplicate/description/
	public static void main(String[] args) {
		int[] nums = { 2, 14, 18, 22, 23 };
		boolean out = findDuplicate(nums);

		System.out.println("is Given array has duplicate: " + out);

	}

	static boolean findDuplicate(int[] nums) {
		int[] arr = sortArray(nums);
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1]) {
				return true;
			}
		}

		return false;

	}

	static int[] sortArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					swap(nums, i, j);

				}
			}
		}
		return nums;
	}

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}
}
