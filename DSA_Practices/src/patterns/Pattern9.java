package patterns;

public class Pattern9 {
//   *********
//    *******
//     *****
//      ***
//       *

	
	public static void main(String[] args) {
		int n = 5;
		pattern9(n);

	}

	 static void pattern9(int n) {
		for(int row = 0; row <n; row++) {
			for(int col = 1; col<=row; col++) {
				System.out.print(" ");
			}
			for(int col = row+1; col<=2*n-1-row; col++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
	}
	
}
