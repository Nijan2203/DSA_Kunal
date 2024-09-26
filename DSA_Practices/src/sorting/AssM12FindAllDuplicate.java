package sorting;

import java.util.ArrayList;
import java.util.List;

public class AssM12FindAllDuplicate {
	// Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,3};
		List<Integer> dup = FindAllDuplicateNum(arr);
		System.out.println("Duplicate Element in the Array is "+ dup);

	}

	 static List<Integer> FindAllDuplicateNum(int[] arr) {
		int i =0;
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
			if(arr[index]!= index+1) {
				out.add(arr[index]);
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
