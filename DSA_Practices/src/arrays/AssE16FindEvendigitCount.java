package arrays;

public class AssE16FindEvendigitCount {
//	Find Numbers with Even Number of Digits
	public static void main(String[] args) {
		int[] arr = {12,345,20,6,7896};
		
		int even = findEvenDigit(arr);
		System.out.println("Total Even digit elements in array are "+ even);
		
	}
	
	static int findEvenDigit(int[] arr) {
		int count = 2; int ans=0;
		for(int i =0; i<arr.length; i++) {
			
			int temp = arr[i];
			int digit = 0;
			while(temp>0) {
				 temp = temp/10;
				digit++;
			}
			
			
			if(digit%count== 0) {
				ans ++;
			}
			
			
		}
		return ans;
		
		
	}

	
	
	
}
