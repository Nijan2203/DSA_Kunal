package patterns;

public class Pattern6 {

//     *
//    **
//   ***
//  ****
// *****
	
	public static void main(String[] args) {
int n = 5;
pattern6(n);
	}

 static void pattern6(int n) {
	for(int row = 1; row<=n; row++) {
	for(int space = 1;  space<=n-row; space++) {
		System.out.print(" ");
		
	}
	for(int col = n-row+1; col<=n; col++) {
		System.out.print("*");
		}
	System.out.println();
	}
	
	
}

}
