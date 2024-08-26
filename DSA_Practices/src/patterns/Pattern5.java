package patterns;

public class Pattern5 {

//		*
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	public static void main(String[] args) {
		int n = 5;
pattern5(n);
	}

 static void pattern5(int n) {
	 				
	
	for(int row =1; row<=2*n-1; row++) {
		int colvalue = row>=n ? 2*n-row : row;
		for(int col = 1; col<=colvalue; col++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

}
