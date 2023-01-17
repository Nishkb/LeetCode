package easy;

import java.util.*;

public class TwoSum {

	/*
	 *  PROBLEM STATEMENT: 
	 *  				We will be given an array of integers and we need to return the index of two numbers which add
	 *  				to a target sum, which will also be given in the form of integer
	 *  
	 *  INPUT: 	
	 *  			1. Array of integers
	 *  			2. target sum in form of int
	 *  
	 *  OUTPUT: 	
	 *  
	 *  			We need to return the output in the form of int and it should be the
	 *  			indexes of the integers from the array 
	 *  			
	 *  			ex. arr[3, 12, 4, 1]
	 *  				target = 15
	 *  
	 *   			answer: [0, 1]
	 *   
	 *   NOTE: YOU CANNOT CONSIDER SAME NUMBER TWICE
	 *   
	 *   APPROACH: We can use brute force in this, but in that case our time complexity would be
	 *   			O(n^2)
	 *   
	 *   For better time efficiency we can use a hashmap, it has time complexity of O(1)
	 */
	
	
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int currNumber = nums[i]; //first number
			int remainingNumber = target - currNumber; //remaining means the number needed to make it = target
			
			if(map.containsKey(remainingNumber)) {
				int index = map.get(remainingNumber);
				
				if(index ==  i) {
					continue;
				}
				return new int[] {i, index};
			}
		}
		
		return new int[] {};
	}
}
