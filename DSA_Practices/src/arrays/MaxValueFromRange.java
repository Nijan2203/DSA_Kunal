package arrays;

public class MaxValueFromRange {

	public static void main(String[] args) {
		int[] a = {1,5120,586,18,51};
		int start = 1;
		int end = 3;
		System.out.println("Maximum number in  the Array range is " + max(a,start,end));

	}

	 static int max(int[] a, int start, int end) {
		int max = a[start];
		 for(int i=start; i<=end; i++) {
			 if(max<a[i]) {
				 max = a[i];
			 }
		 }return max;
	}

}
