package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssE11MatchingRule {
//	Count Items Matching a Rule - https://leetcode.com/problems/count-items-matching-a-rule/description/
	public static void main(String[] args) {

		List<List<String>> items = new ArrayList();
		items.add(Arrays.asList("phone", "blue", "pixel"));
		items.add(Arrays.asList("computer", "blue", "pixel"));
		items.add(Arrays.asList("phone", "blue", "pixel"));

		String rulekey = "type";
		String rulevalue = "phone";
		int outputcount = findMatch(items, rulekey, rulevalue);
		System.out.println("Total count of the value " + outputcount);
	}

	static int findMatch(List<List<String>> items, String rulekey, String rulevalue) {
		int i = 0;
		if (rulekey.equals("type")) {
			i = 0;
		} else if (rulekey.equals("color")) {
			i = 1;
		} else {
			i = 2;
		}

		int count = 0;
		for (List<String> e : items) {
			if (rulevalue.equals(e.get(i)))
				count++;
		}

		return count;

	}
}