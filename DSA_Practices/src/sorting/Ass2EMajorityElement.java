package sorting;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ass2EMajorityElement {

//	Majority Element - https://leetcode.com/problems/majority-element/description/
	public static void main(String[] args) {
		
int [] nums = {4,5,4};
int out = findMajority(nums);
System.out.println("Majaority Elements in the Array is " + out);
	}

	 static int findMajority(int[] nums) {
		int[] arr = sortArray(nums);
		return arr[arr.length/2]; 
	 }
		
		

	 static int[] sortArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					swap(nums, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

	 static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i]= nums[j];
		nums[j] = temp;
		
	}

}
