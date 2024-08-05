package searching;

public class BinarySearch {

	public static void main(String[] args) {
int[]  arr = {-5,-4,-2,1,5,48,1581,5151,5185,9866};
int target = 5151;

System.out.println("Index of the given target "+target+ " is "+ binarySearch(arr, target) );
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
	
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(target>arr[mid]) {
		start = mid;
		
			}else if(target<arr[mid]) {
				end = mid;
			}else {
				return mid;
			}
	}return -1;
	
	

}
}
