package searching;

public class RBS {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,8,9,1};
		int target = 1;
		
		int ind = search(arr, target);

		System.out.println("search value index is "+ ind);
	}
	
	
	static int search(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		if(pivot == -1) {
			return binearySearch(arr, target, 0, arr.length-1);
		}
		
		if(arr[pivot] == target) {
			return pivot;
		}
		
		
		if(target>=arr[0]) {
			return binearySearch(arr, target, 0, pivot-1);
		}
		
		return binearySearch(arr, target, pivot+1, arr.length-1);
		
	}
	
	 static int binearySearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]<target) {
				start = mid+1;
			}else if(arr[mid]>target) {
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}


	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(mid < end && arr[mid]> arr[mid+1]) {
				return mid;
			}if(mid > start && arr[mid]< arr[mid-1]) {
				return mid-1;
			}if(arr[mid]>=arr[start]) {
				start = mid+1;
			}else {
			end = mid-1;
		}
		
		
		
	}
		return -1;
}
	
	
	
	
	
	
}