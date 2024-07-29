package arrays;

import java.util.Arrays;

public class ArrayReverse {
	
		public static void main(String[] args) {
			int[] a = {1,81,81,887,487,784};
			
			int[] rev = reverse(a);
			System.out.println("Reverse array of a is "+ Arrays.toString(rev));
		}

		 static int[] reverse(int[] a) {
			 int start = 0;
			 int last = a.length-1;
			 
			while(last>0) {
				int temp = a[start];
				a[start] = a[last];
				a[last] = temp;
				start++;
				last--;
			}
			return a;
		}

}
