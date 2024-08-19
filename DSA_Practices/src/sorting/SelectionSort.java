package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,5,3,4,2};
	sortSelection(arr);
System.out.println(Arrays.toString(arr));
	}

	
	static void sortSelection(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			
		for(int j=i+1; j<arr.length-i; j++) {
		 max = 	getmaxvalue(arr, i, j);
			
		}swap(arr,max, arr.length-i-1);
			
		}
	
	}


	private static void swap(int[] arr, int max, int i) {
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;

		
	}


	private static int getmaxvalue(int[] arr, int i, int j) {
		int max =0;
		if(arr[i]>arr[j]) {
			 max = arr[i];
		}
		return max;
	}
}
