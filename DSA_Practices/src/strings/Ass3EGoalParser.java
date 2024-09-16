package strings;

import java.util.Arrays;

public class Ass3EGoalParser {
	
	public static void main(String[] args) {
		String command = "G()(al)";
		String out =interpret(command);
		System.out.println(out);
	}
	
	
	 static String interpret(String command) {
		StringBuilder st =  new StringBuilder();
	for(int i=0; i<command.length(); i++) {
		if(command.charAt(i)== 'G') {
			st.append('G');
			
		}if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
			st.append('o');
			
		} if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
			st.append("al");
		}
	}
		return st.toString();
	    }

}
