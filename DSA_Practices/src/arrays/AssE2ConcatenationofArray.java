package arrays;

import java.util.Arrays;

public class AssE2ConcatenationofArray {
//	Concatenation of Array - https://leetcode.com/problems/concatenation-of-array/description/
	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };

		int[] out = isconcat(a);
		System.out.println(Arrays.toString(out));

	}

	static int[] isconcat(int[] a) {
		int[] ans = new int[2 * a.length];
		int j = 0;
		for (int i = 0; i < ans.length; i++) {
			if (i < a.length)
				ans[i] = a[i];
			if(i>=a.length){
				ans[i] = a[j];
				j++;

			}

		}
		return ans;

	}
}
