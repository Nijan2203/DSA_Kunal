package Strings;

import java.util.Arrays;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String input = "viicky";
	String output =  	removedup(input);
		System.out.println(output);
	}
	
	
	static String removedup(String input) {
		char[] st = input.toCharArray();
		StringBuilder str = new StringBuilder();
				
		int start = 0;
		int end  = st.length-1;
		int count  = 0;
		for(int i=start; i<=end; i++) {///
				
			for(int j=i+1; j<=end; j++) {
				if(st[i]==st[j]) {
					count++;
				}
				
			}
			if(count==0 ) {
				str.append(st[i]);
			}
			count =0;
			
			}
		
		return str.toString();
		
	}
}

