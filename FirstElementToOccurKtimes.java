package array;

import java.util.*;

public class FirstElementToOccurKtimes {

	public int element(int[] a, int n, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < a.length; i++) {
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			
			else {
				map.put(a[i], 1);
			}
		
			if(map.get(a[i]) == k) 
				return a[i];
		}
		
		/*
		 * for(Map.Entry entry: map.entrySet()) { System.out.println("Element | Key");
		 * System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */		
		
		return -1;
	}
	
}
