package arrays;

public class MaxFromArrayRange {

	public static void main(String[] args) {
int[] a = {516,65,601,981,19,98};

int out = max(a,0,2);
System.out.println("Max number of the given array range is "+out);
	}

	private static int max(int[] a, int start, int end) {
		int max = a[start];
		for(int i =start; i<=end; i++) {
			if(a[i]>max) {
				max = a[i];
				
			}
		}
		return max;
	}

	
	
	
	
}
