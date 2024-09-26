package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssE10Pangram {
//	Check if the Sentence Is Pangram - https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean res = findPanGram(sentence);
		System.out.println("is Given Sentence is pangram " + res);

	}

	static boolean findPanGram(String sentence) {

		boolean pangram = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (!sentence.contains(String.valueOf(ch))) {
				return false;

			}
		}

		return pangram;

	}
}
