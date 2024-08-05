package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
int[] a = {1,2,3,4,5,6};

reversearray(a);
System.out.println(Arrays.toString(a));
	}

	 static void reversearray(int[] a) {
		 int start = 0; 
		 int last = a.length-1;
		 for(int i=start; i<last; i++) {
			 int temp = a[start];
			 a[start] = a[last];
			 a[last] = temp;
			 
			 start++;
			 last--;
		 }
	}

}
