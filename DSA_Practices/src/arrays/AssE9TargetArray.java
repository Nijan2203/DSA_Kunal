package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AssE9TargetArray {
//	Create Target Array in the Given Order [0,4,1,3,2] - https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//	out{

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		int[] output = findTarget(nums, index);
		System.out.println(Arrays.toString(output));
	}

	static int[] findTarget(int[] nums, int[] index) {
		ArrayList<Integer> output = new ArrayList<Integer>();
//		int[] output = new int[nums.length];
		for (int i = 0; i < index.length; i++) {
			output.add(index[i], nums[i]);

		}

	int[] out = new int[output.size()];
	for(int i=0; i<output.size(); i++) {
		out[i] = output.get(i);
	}
	
	return out;

	}

}
