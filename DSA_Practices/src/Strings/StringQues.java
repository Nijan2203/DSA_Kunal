package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringQues {

	public static void main(String[] args) {
		String st = "TAAADDDDDEEEEEE";
		findResult(st);
	}
//
//	static void findResult(String st) {
//		StringBuilder out = new StringBuilder();
////		System.out.println(out);
//		char[] ch = st.toCharArray();
//		char first = st.charAt(0);
//		int count = 0;
//		for (int i = 0; i <= ch.length - 1; i++) {
//			if (first == st.charAt(i)) {
//				count++;
//			} else {
//				if (count < 6) {
//					out.append(first).toString();
//					out.append(count).toString();
//					first = st.charAt(i);
//					count = 1;
//				} else {
//					count = count / 2;
//					out.append(first).toString();
//					out.append(count).toString();
//					out.append(first).toString();
//					out.append(count).toString();
//					first = st.charAt(i);
//					count = 1;
//				}
//			}
//		}
//		if (count < 6) {
//			out.append(first).toString();
//			out.append(count).toString();
//		} else {
//			count = count / 2;
//			out.append(first).toString();
//			out.append(count).toString();
//			out.append(first).toString();
//			out.append(count).toString();
//		}
//		System.out.println(out.toString());
//	}

	 static void findResult(String st) {
		Map<Character, Integer> maplist = new LinkedHashMap<>();
		char[] ch = st.toCharArray();
		
		for(char c: ch) {
		int value = maplist.getOrDefault(c,0);
		System.out.println(value+1);
			maplist.put(c,value+1);
		}
		
		StringBuilder out = new StringBuilder();
		Set<Entry<Character, Integer>>	 entery = maplist.entrySet();
		
		
	for(Entry<Character, Integer> e : entery){
		char charect = e.getKey();
		int count = e.getValue();
		
		if(count<6) {
			out.append(charect).append(count);
		}else {
			out.append(charect).append(count/2).append(charect).append(count/2);
		}
	}
	
	System.out.println(out.toString());
	}
	
	
}
