package arrays;

import java.util.Arrays;

public class ConcatenationofArray {
//	Concatenation of Array
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
			else {
				ans[i] = a[j];
				j++;

			}

		}
		return ans;

	}
}
