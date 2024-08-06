package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCandles {

	public static void main(String[] args) {
int[] candies = {2,3,5,1,3};
int extraCandies = 3;
		
		 List<Boolean> res =  kidsWithCandies(candies, extraCandies);
		  System.out.println("output" +res);
	}
	
	  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int max = 0;
		int i=0;
		for(int ele : candies) {
			max = ele +extraCandies;
		
			
				while(max>candies[i]) {
					result.add(true);
					
				}
				i++;
				
			}		
		
		
		
		return result ;
		  
	  }

	  
	  
}
