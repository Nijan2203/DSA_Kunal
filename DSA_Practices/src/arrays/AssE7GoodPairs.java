package arrays;

public class AssE7GoodPairs {
//	Number of Good Pairs - https://leetcode.com/problems/number-of-good-pairs/description/
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3}; 
		
		int pairs = numIdenticalPairs(nums);
		System.out.println("Number of Good pairs are " +pairs);
	}

	static int numIdenticalPairs(int[] nums) {
        int count  = 0;
        for(int i = 0; i<nums.length; i++){
            
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]== nums[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
