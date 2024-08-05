package arrays;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
				int[] out = shuffle(nums, n);
System.out.println(Arrays.toString(out));
	}

	
	 static int[] shuffle(int[] nums, int n) {
       int[] out = new int[nums.length];
        
      for(int i=0; i<nums.length;   i++) {
    	  
    	  if(i==0) {
    		  out[i] = nums[i];
    		  
    	  }
    	 
    	if(i%2 == 1) {
    		int temp = nums[i];
    		out[i] = nums[n];
    		nums[n] = temp;
    		n++;
    	}else {
    		out[i] = nums[i];
    	}
           
            
        }return out;
	}
}
