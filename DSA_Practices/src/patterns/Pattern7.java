package patterns;

public class Pattern7 {
//	  *****
//     ****
//      ***
//       **
//        *
	
	public static void main(String[] args) {
		int n = 5;
		pattern7(n);
			}

 static void pattern7(int n) {
	for(int row=1; row<=n; row++) {
		for(int col=1; col<row; col++) {
			System.out.print(" ");
		}
		for(int col = row; col<=n; col++) {
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
}

}
