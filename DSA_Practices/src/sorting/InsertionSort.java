package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,1,2,4,3};
		int[]  out = findInsertion(arr);
System.out.println(Arrays.toString(out));
	}

	  static int[]  findInsertion(int[]  arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}
		return arr;
	}

	 static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	

}
