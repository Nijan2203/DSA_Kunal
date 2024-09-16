package sorting;

public class MissingPositive {
	// https://leetcode.com/problems/first-missing-positive/

	public static void main(String[] args) {
		int[] nums =  {-7,0,9,11,12};
		int miss = MissingPostive(nums);
System.out.println(miss);
	}

	 static int MissingPostive(int[] nums) {
		int i = 0;
		while(i<nums.length) {
			int correct = nums[i]-1;
			if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) {
				swap(nums, i, correct);
			}else {
				 i++;
			}
		}
		for(int index = 0; index<nums.length; index++) {
			if(nums[index]!=index+1) {
				return index+1;
			}
		}
		return nums.length+1;
	}

	 static void swap(int[] nums, int i, int correct) {
		int temp = nums[i];
		nums[i] = nums[correct];
		nums[correct] = temp;
		
	}

}
