package strings;

import java.util.Arrays;
//Shuffle String - https://leetcode.com/problems/shuffle-string/description/
public class Ass2EShuffleString {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String out = restoreString(s, indices);
		System.out.println(out);
	}

 static String restoreString(String s, int[] indices) {
	 char[] t = new char[s.length()]  ;
	 for(int i=0; i<s.length(); i++) {
		 t[indices[i]]= s.charAt(i);
	 }
	 
	 
	 StringBuilder st = new StringBuilder();
	 for(char c : t) {
		 st.append(c);
	 }
	 
	return st.toString();
		
	}

}
