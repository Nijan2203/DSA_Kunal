package searching;

public class CeilingOfNumber {
	
	
//	ceiling of the given number array  = {2,3,5,9,14,16,18}
	//logic --> smallest element in array >=target

	public static void main(String[] args) {
int[] arr = {2,3,5,9,14,16,18};
int target = 10;

int out = ceilingNum(arr, target);
System.out.println("Ceiling of the given target "+ target +" index is "+ out);
	}
	
	
	static int ceilingNum(int[] arr, int target) {
	int start = 0;
	int end  = arr.length-1;
	int mid = 0;
	while(start<=end) {
		 mid = start+(end-start)/2;
		
		

		 if(arr[mid]>target) {
			end = mid-1;
		}else if(arr[mid]<target) {
		start = mid+1;	
		}else  {
			return mid;
		}
	}
	
	return start;
		
	}

}
