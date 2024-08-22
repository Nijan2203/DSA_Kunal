package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssE10Pangram {
//	Check if the Sentence Is Pangram
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean res =  findPanGram(sentence);
		System.out.println("is Given Sentence is pangram "+ res);

	}

	 static boolean findPanGram(String sentence) {
		 char[] st= sentence.toCharArray();
		
		 String outst = String.valueOf(st[0]);
		 for(int i=1; i<st.length; i++) {
			
			 if(st[i]!=st[0]) {
				 outst = (String) (st[i]+outst);
			 }
				 
		 }
		
//		 if(outst.length()==26) {
//			 return true;
//		 }
		return false;
		}
	}


