package searching;

public class MountainArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,8,16,4,1};
		
		int peakindex = peakindex(arr);
		System.out.println("Peak element index is" +peakindex);
		

	}

	 static int peakindex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
				
			}
		}
		return end;
	}
}