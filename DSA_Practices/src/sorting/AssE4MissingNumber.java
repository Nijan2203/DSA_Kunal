package sorting;

public class AssE4MissingNumber {
	//MissingNumber - https://leetcode.com/problems/missing-number/
	// Amazon Question

	public static void main(String[] args) {
		int[] arr =  {4, 0, 3, 1};
		int miss = findMissingNum(arr);
		System.out.println("The missing Number is "+ miss);

	}

	 static int findMissingNum(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		for(int index=0; index<=arr.length; index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		return arr.length;
	}

	 static void swap(int[] arr, int i, int correct) {
		int temp = arr[i];
		arr[i] =  arr[correct];
		arr[correct] = temp;
		
	}

}
