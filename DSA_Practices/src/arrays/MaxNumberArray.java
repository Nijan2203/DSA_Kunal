package arrays;

public class MaxNumberArray {

	public static void main(String[] args) {
		int a[] = { 1, 56, 6514, 684, 846 };

		int out = max(a);
		System.out.println("Max number of the Array is " + out);
	}

	static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
