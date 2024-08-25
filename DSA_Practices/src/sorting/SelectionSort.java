package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,4,2};
	sortSelection(arr);
System.out.println(Arrays.toString(arr));
	}

	
	static void sortSelection(int[] arr) {
	for(int i=0; i<arr.length; i++) {
		int last = arr.length-1-i;
		int maxindex = findMax(arr, 0, last);
		swap(arr, maxindex, last);
	}
	
	}


	  static void swap(int[] arr, int maxindex, int last) {
		int temp = arr[maxindex];
		arr[maxindex] = arr[last];
		arr[last] = temp;
		
	}


	static int findMax(int[] arr, int start, int end) {
		 int max = start;
		for(int i=start; i<=end; i++) {
			if(arr[max] <arr[i]){
				max = i ;
			}
		}
//		System.out.println(max);
		return max;
	}
		
	}
