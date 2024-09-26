package sorting;

public class AssM11FindDuplicate {

	public static void main(String[] args) {
//		Find the Duplicate Number - https://leetcode.com/problems/find-the-duplicate-number/description/
		int[] arr = {2,1,2};
		int dup = findduplicate(arr);
		System.out.println("Duplicate element in the array is "+ dup);

	}

	 static int findduplicate(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {
			int correct = arr[i]-1;
				if(arr[i]!=arr[correct]) {
					swap(arr, i, correct);
				}else {
					return arr[i];
				}
			}else {
				i++;
			}
		}
		return -1;
	}

	 static void swap(int[] arr, int i, int correct) {
		int temp = arr[i];
		arr[i] = arr[correct];
		arr[correct] = temp;
		
	}

}
