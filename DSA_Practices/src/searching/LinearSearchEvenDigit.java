package searching;

public class LinearSearchEvenDigit {

	public static void main(String[] args) {
int[] arr = {12,345,2,6,7896};
int out = linearSearchEvenDigit(arr);
System.out.println(out);
	}

	
	static int linearSearchEvenDigit(int[] arr) {
		int digit = 0; int temp = 0; int count=0;
		for(int i=0; i<arr.length; i++) {
			temp=arr[i] ;
			while(temp>0) {
				temp = temp/10;
				digit++;
				
			}
			if(digit%2==0) {
				count++;
			}	
			digit= 0;
		}
		
		return count;
		}
			
			
}
