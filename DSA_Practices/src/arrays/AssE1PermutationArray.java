package arrays;

import java.util.Arrays;

public class AssE1PermutationArray {
//	Build Array from Permutation - https://leetcode.com/problems/build-array-from-permutation/description/
	public static void main(String[] args) {
		int[] a = {1,0,4,3,2,5};
		
		
		int[] res =  bulidarray(a);
		System.out.println(Arrays.toString(res));

	}

 static int[] bulidarray(int[] a) {
	int[] ans = new int[a.length];
	for(int i= 0; i<a.length; i++) {
		ans[i] = a[a[i]];
	}
	return ans;
}

}
