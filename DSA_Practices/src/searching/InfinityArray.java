package searching;

public class InfinityArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,8,11,12,16,18,20,22,26,67,84};
		int target = 18;
		
		int ind = findrange(arr, target);
		System.out.println("Index of the given target "+target+" is "+ind);
		

	}
	
	static int findrange(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while(target>arr[end]) {
			int temp = end+1;
			end = end+(end-start+1)*2;
			start = temp;
			
		}
		
		return binearySearch(arr,  target,  start,  end);
	}

	 static int binearySearch(int[] arr, int target, int start, int end) {
		 while(start<=end) {
			 int mid = start+(end-start)/2;
			 if(arr[mid]> target) {
				 end = mid-1;
			 }else if(arr[mid]<target) {
				 start = mid+1;
			 }else {
				 return mid;
			 }
		 }
		return -1;
	}
	
	
	

}
