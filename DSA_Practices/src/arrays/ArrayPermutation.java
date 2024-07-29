package arrays;

import java.util.Arrays;

public class ArrayPermutation {
//	Build Array from Permutation
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,0,5};
	
	int[] out = buildArray(arr);
	
	System.out.println(Arrays.toString(out));

	}

 static int[] buildArray(int[] arr) {
	int[] ans= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			ans[i] = arr[arr[i]];
	}
		return ans;
}

}
