package sorting;

import java.util.Arrays;

public class AssE1MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {4,2,3};
		int m = 0;
		int[] nums2 = {1};
		int n = 1;
		
		
	int[]	out = merge(nums1,m,nums2,n);
	System.out.println("sorted array order is "+ Arrays.toString(out));
	}

	
	
	
	 static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int j = 0;
        for(int i=0; i<ans.length; i++){
            
            if(ans.length>i && i<m){
                ans[i] = nums1[i];
            }else {
                ans[i] = nums2[j];
              j++ ;
            } 
        }
        return sortarray(ans);
       
	 }
     
     

        
        static int[] sortarray(int[] ans) {
        	
        
        for (int i =0; i<ans.length; i++) {
        	for(int j=i+1;j<ans.length-i; j++ ) {
        		if(ans[i]> ans[j]) {
        			int temp = ans[i];
        			ans[i] = ans[j];
        			ans[j] = temp;
        		}
        		
        	}
        }
        
		return ans;
        
      
    }
}
