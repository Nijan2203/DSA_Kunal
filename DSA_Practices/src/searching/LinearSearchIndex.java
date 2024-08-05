package searching;

public class LinearSearchIndex {

	public static void main(String[] args) {
		int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
		int target = 19;

		int index = linearSearchindex(nums, target);
		if (index != Integer.MIN_VALUE)
			System.out.println("Target element " + target + "'s index is " + index);
		else
			System.out.println("Target element " + target + "'s not available in the array");
		int element = LinearSearchElement(nums, target);
		if (element != Integer.MIN_VALUE)
			System.out.println("Target element is " + element);
		else
			System.out.println("Target element is not available in the array");
		boolean b = LinearSearchBoolean(nums, target);
		if (b==true)
			System.out.println("Target element " + target + "'s index is available in the array");
		else
			System.out.println("Target element " + target + "'s not available in the array");
	}

//	search in the array: return the index if item found
	// otherwise if item not found return -1
	static int linearSearchindex(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				return i;
			}
		}
		return Integer.MIN_VALUE;

	}

//	search the target and return the element

	static int LinearSearchElement(int[] arr, int target) {
		for (int ele : arr) {
			if (ele == target) {
				return ele;
			}
		}
		return Integer.MIN_VALUE;
	}
	
//	 search the target and return true or false
	static boolean LinearSearchBoolean(int[] arr, int target) {
		for(int ele: arr) {
			if(ele==target) {
				return true;
			}
		}
		return false;
	}

}
