package searching;

import java.util.Arrays;

public class FirstAndLastPosition {

	//Find First and Last Position of Element in Sorted Array

	public static void main(String[] args) {
		int[] arr = {0,8,8,8,8,9};
		int target = 8;
		int[] out = findrange( arr,  target);
		System.out.println(Arrays.toString(out));
	}

	
	static int[] findrange(int arr[], int target) {
		int ans[] = {-1,-1};
	ans[0] = binearySearch(arr, target, true);
	ans[1]  = binearySearch(arr,target,false);
	
	
	
	return ans;
		
		
	}
	
	
	static int binearySearch(int[] arr, int target, boolean findstart) {
		int ans = -1;
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
		int mid = start+(end-start)/2;
		
			if(arr[mid]>target) {
				end = mid-1;
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				ans = mid;
				if(findstart) {
					end =  mid-1;
				}else {
					start =  mid+1;
				}
			}
		}
		return ans;
	}
		
	}

