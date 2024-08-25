package sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
	int[] arr = {5,2,3,4,1};
	int[] out = findCyclicSort(arr);
System.out.println(Arrays.toString(out));
	}

	 static int[] findCyclicSort(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}else {
				
				i++;
			}
		}
		return arr;
	}

	 static void swap(int[] arr, int i, int correctIndex) {
		int temp = arr[i];
		arr[i] =  arr[correctIndex];
		arr[correctIndex] = temp;
		
	}

}
