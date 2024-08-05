package searching;

public class LinearSearchInRange {

	public static void main(String[] args) {
String name = "Nijanthan Thangavel";
char target = 'n';

int output = linearSearchRange(name, target, 0, 8);
if(output!=Integer.MIN_VALUE) {
System.out.println("Searched target element is available " + output);
}else {
	System.out.println("Searched target element not present in the index of "+ output);
}
	}

	
	static int linearSearchRange(String name, char target, int start, int end) {
		for(int i=start; i<=end; i++) {
			if(name.charAt(i)==target) {
				return i;
			}
		}
		return Integer.MIN_VALUE;
	}
}
