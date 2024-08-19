package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] sortarr =  sortBubble(arr);
		System.out.println(Arrays.toString(sortarr));

	}

	private static int[] sortBubble(int[] arr) {
		boolean swapped;
		
		for(int i=0; i<arr.length; i++) {
			swapped = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		return arr;
	}

	

}
