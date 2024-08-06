package searching;

public class FloorOfNumber {

	public static void main(String[] args) {
//		floor  of the given number array  = {2,3,5,9,14,16,18}
		//logic --> Greatest element in array <=target

	int[] arr = {2,3,5,9,14,16,18};
	int target = 14;

	int out = floorNum(arr, target);
	System.out.println("Floor of the given target "+ target +" index is "+ out);
		

	}

	 static int floorNum(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]>target) {
				end = mid-1;
				
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				return arr[mid];
			}
		}
		 
		 
		return arr[end];
	}

}
