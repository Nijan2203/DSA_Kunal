package searching;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		int [] arr = {100,20,19,17,10,1,-1};
		int target = 1;
		int ind = orderAgnosticBS(arr, target, arr[0], arr[arr.length-1]);
System.out.println("element index is "+ ind);
	}

	
	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		int first = 0;
		int last = arr.length-1;
		int mid = 0;
		if(start<=end) {
			while(first<=last) {
				 mid = first+(last-first)/2;
			if(arr[mid]>target) {
				last  = mid-1;
			}else if(arr[mid]<target) {
				first = mid+1;
			}else {
				return mid;
			}
			}
		}else {
			while(first<=last) {
			 mid = first+(last-first)/2;
		if(arr[mid]>target) {
			first  = mid+1;
		}else if(arr[mid]<target) {
			last = mid-1;
		}else {
			return mid;
		}
		}
			
		}
		return -1;
		
	}
}
