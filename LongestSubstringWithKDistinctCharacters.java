package slidingWindow;

import java.util.*;

public class LongestSubstringWithKDistinctCharacters {
	
	/**
	 *  **
	 *  	Whenever the size is variable then think about using a map.
	 *  **
	 * 
	 * 
	 * Input: 
	 * 			String: aa ba c be be be
	 *             	 k: 3
	 *             
	 * According to the problem statement we need to get a substring with only 3 unique characters
	 * 
	 * Output:
	 * 
	 *  			we need to output the size of the longest substring with 3 distinct characters, which is an integer
	 * 
	 * IDENTIFICATION: 
	 * 
	 * 				we need to get the window size, and a String is given and we need to get the window size of that substring 
	 * 
	 * 
	 * 
	 * FORMAT: 
	 * 
	 * 		while (i < size )
	 * 			
	 * 			{
	 * 					calculations
	 * 
	 * 				if ( condition < k )
	 * 			
	 * 						i++
	 * 
	 * 				else if ( condition == k )
	 * 
	 * 					{
	 *  				
	 *  					answer <-- calulations
	 *  					i++
	 *  									
	 *  				}
	 *  
	 *  			else if ( condition > k )
	 *  			
	 * 				{
	 *  
	 *  				while ( condition > k )
	 *  
	 *  				{
	 *  
	 *  					remove calculations for i
	 *  					i++				
	 *  
	 *  				}
	 *  
	 *  			}
	 *  		}
	 *  
	 *  CONDITION: 
	 *  
	 *  			number of unique characters in a sliding window
	 *  
	 *  
	 *  DATA STRUCTURE: 
	 *  
	 *  			The best data structure to use to keep the count of number of unique characters is a Map
	 */

	
	public static int findLength(String s, int k) {
		
		if(s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		int windowStart = 0, maxLength = 0;
		Map<Character, Integer> characterCount = new HashMap<>();
		
		
		for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			
			char rightChar = s.charAt(windowEnd);
			characterCount.put(rightChar, characterCount.getOrDefault(rightChar, 0) + 1);
		
		while(characterCount.size() > k) {
			
			char leftChar = s.charAt(windowStart);
			characterCount.put(leftChar, characterCount.get(leftChar) - 1);
			
			if(characterCount.get(leftChar) == 0) {
				characterCount.remove(leftChar);
			}
			windowStart++;
		}
		
		maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		
		}
		
		
		return maxLength;
	}
	
}
 