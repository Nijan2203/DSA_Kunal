package searching;

public class LinearSearchInStrings {

	public static void main(String[] args) {
String name = "Nijanthan Thangavel";
char target = 'r';

char output = linearSearchString(name, target);
if(output!='X') {
	System.out.println("Searched target element is available " + output);
}else {
	System.out.println("Searched target element is not available " + output);
}
	}
	
	static char linearSearchString(String name, char target) {
		char[] ch = name.toCharArray();
		for(char ele: ch) {
			if(ele==target) {
				return ele;
			}
		}
		return 'X';
	}
}
