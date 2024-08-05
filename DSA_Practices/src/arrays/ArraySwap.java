package arrays;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
int[] a = {1,2,3,4};
swap(a,1,3);

System.out.println(Arrays.toString(a));
		
	}

	 static void swap(int[]a, int i, int j) {
		
	int	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
	
		
		
	}

}
