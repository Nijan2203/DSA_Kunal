package sorting;

import java.util.Arrays;

public class AssE1MergeSortedArray {
//	Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/description/
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;

		merge(nums1, m, nums2, n);
//		System.out.println("sorted array order is " + Arrays.toString(out));
	}

	 static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] ans = new int[m + n];
		int j = 0;
		for (int i = 0; i < ans.length; i++) {

			if (ans.length > i && i < m) {
				ans[i] = nums1[i];
			} else{
				ans[i] = nums2[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(sortarray(ans)));

	}

	static int[] sortarray(int[] ans) {
		for(int i=0; i<=ans.length-1; i++) {
			for(int j=i+1; j<ans.length-i; j++) {
				if(ans[i]>ans[j]) {
					swap(ans, i, j);
				}
			}
		}
		return ans;

	}

	static void swap(int[] ans, int i, int correctIndex) {
		int temp = ans[i];
		ans[i] = ans[correctIndex];
		ans[correctIndex] = temp;

	}
}
