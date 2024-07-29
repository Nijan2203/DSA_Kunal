package arrays;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 8, 4 };

		int[] res = swap(arr, 0, 3);
		System.out.println(Arrays.toString(res));
	}

	static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;

	}

}
