package searching;

public class OrderAgbisticBS {

	public static void main(String[] args) {
		int[] arr = {554,78,8,4,3,2,1};
		int target = 2;
		int start = 0;
		int end  = arr.length-1;
		if(arr[start]>=arr[end]) {
			int desc = abisticBSDes(arr, target);
			System.out.println("Target element present in  "+ desc);
		}else {
			int  aces = abisticBSAces(arr, target);
			System.out.println("Target element present in "+ aces);
		}
		
	

	}
	
	 static int abisticBSAces(int[] arr, int target) {
		int start = 0;
		int end =arr.length-1;
		
		while (start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]>target) {
				end = mid-1;
			}else  if(arr[mid]<target) {
				start = mid+1;
			}else if(arr[mid]==target) {
				return mid;
			}
		}
		return -1;
	}

	static int abisticBSDes(int[] arr, int target) {
		
		int start = 0;
		int end =arr.length-1;
		
		while (start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]>target) {
				start = mid+1;
			}else  if(arr[mid]<target) {
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}

}
