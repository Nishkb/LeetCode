package slidingWindow;

//QUESTION

//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.


public class MaxSumSubArrayOfSizeK {

	public int findMaxSumSubArr(int k, int[] arr) {
	
	int maxSum = 0, windowSum = 0;
	int windowStart = 0;
	
	for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
		
		windowSum = windowSum + arr[windowEnd]; //this line adds next element to the sum
		
		if(windowEnd >= k - 1) {
			maxSum = Math.max(maxSum, windowSum);
			windowSum = windowSum - arr[windowStart];
			windowStart++;
		}
	}
	
	return maxSum;
	
	}
	
public static void main(String[] args) {
	
	MaxSumSubArrayOfSizeK obj = new MaxSumSubArrayOfSizeK();
	System.out.println("Maximum sum of a subarray of size k: " + obj.findMaxSumSubArr(3, new int[] {2, 1, 5, 1, 3, 2}));
}
}
