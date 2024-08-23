package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssE6MaxCandles {
//	 Kids With the Greatest Number of Candies

	public static void main(String[] args) {
int[] candies = {2,3,5,1,3};
int extraCandies = 3;
		
		 List<Boolean> res =  kidsWithCandies(candies, extraCandies);
		  System.out.println("output" +res);
	}
	
	  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int maxvalue = findMax(candies);
		for(int i=0; i<candies.length; i++) {
			if(candies[i]+extraCandies>=maxvalue) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		return result;
		  
	  }

	 static int findMax(int[] candies) {
		int max = candies[0];
		for(int i=1; i<candies.length; i++) {
			if(max<candies[i]) {
				max = candies[i];
			}
		}
		return max;
		
	}

	  
	  
}
