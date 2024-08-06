package searching;

public class FindMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2 };
		int target = 0;
		int out = findInMountainArray(target, arr);
		System.out.println("target element is placed in the " + out);

	}

	static int findInMountainArray(int target, int[] mountainArr) {
		int peak = peakValueinArray(mountainArr);
		int firsttry = orderABS(mountainArr, target, 0, peak);
		if (firsttry != -1) {
			return firsttry;
		}
		return orderABS(mountainArr, target, peak + 1, mountainArr.length - 1);
	}

	static int peakValueinArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}

		}
		return start;
	}

	static int orderABS(int[] arr, int target, int start, int end) {
//		int first = arr[start];
//		int last = arr[end];
		boolean isasc = arr[start] < arr[end];
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			
			if(isasc) {
				if (arr[mid] > target) {
					end = mid - 1;
				} else  {
					start = mid + 1;
				}
			}else {
					if (arr[mid] > target) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
				
			}
		
		
		return -1;
	}
}
