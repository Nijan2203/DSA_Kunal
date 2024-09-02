package patterns;

public class Pattern8 {
//	 	*
//     ***
//    *****
//   *******
//  *********

	public static void main(String[] args) {
		int n = 5;
		pattern8(n);
	}

 static void pattern8(int n) {
	 for(int row =0; row<n; row++) {
		 
		 for(int col =1; col<n-row; col++) {
			 System.out.print(" ");
			
		 }
		 for(int col = n-row;col<= row+n; col++) {
			 System.out.print("*");
		 }
		 
		 System.out.println();
		
	 }
	
}

}
