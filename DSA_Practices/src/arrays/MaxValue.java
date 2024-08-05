package arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = {1,2,300,55,4};

		int max= max(arr);
		System.out.println("Maximum number of the Array is "+max);
		
		
	}

	 static  int max(int[] arr) {
		 int max = arr[0];
		 for(int i=0; i<arr.length; i++) {
			 if(max<=arr[i]) {
			 max = arr[i];
			 }
			
		 }
		 
		return max;
		
	}

}
