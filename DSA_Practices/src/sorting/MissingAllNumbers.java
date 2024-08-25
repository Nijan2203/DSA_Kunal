package sorting;

import java.util.ArrayList;
import java.util.List;

public class MissingAllNumbers {
	// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	// Asked in Google

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		List<Integer> out = MissingAllNum(arr);
		System.out.println(out);

	}

	 static List<Integer> MissingAllNum(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		List<Integer> out = new ArrayList<Integer>();
		for(int index = 0; index<arr.length; index++) {
		if(arr[index]!=index+1) {
			out.add(index+1);
		}
		}
		
		return out;
	}

	 static void swap(int[] arr, int i, int correct) {
		int temp = arr[i];
		arr[i] = arr[correct];
		arr[correct] = temp; 
		
	}

}
