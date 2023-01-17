package slidingWindow;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	 /*
	  * We need to find out the longest substrings with all characters unique in it 
	  * according to the problem description
	  * 
	  *  INPUT :
	  *  			we will be given just a string in the input and we need to take 
	  *  			a substring out of it
	  *  
	  *  OUTPUT: 
	  *  			We need to return the size of the longest substrin which will be
	  *  			in the form of an int
	  *  
	  *  IDENTIFICATION:
	  *  			
	  *  			arr | subarr
	  *  			str | substr
	  *  		 window | condition
	  *  
	  */
	
	
	public static int findLength(String s) {
		
		if(s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		int windowStart = 0, maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			
		char j = s.charAt(windowEnd);
		map.put(j, map.getOrDefault(j, 0) + 1);
		
		
		while(map.size() < (windowEnd - windowStart + 1)) {
			
			char i = s.charAt(windowStart);
			map.put(i, map.get(i));
		
			if(map.get(i) == 0) {
				map.remove(i);
			}
			
			windowStart++;
		}
		
		maxLength = Math.max(maxLength, (windowEnd - windowStart + 1));
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Length of the longest substring: " + LongestSubstringWithoutRepeatingCharacters.findLength("pwwkewabc"));
		System.out.println("Length of the longest substring: " + LongestSubstringWithoutRepeatingCharacters.findLength("cbbebiert"));
	}
}
