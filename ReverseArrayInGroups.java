package array;

public class ReverseArrayInGroups {

	
	public void reverse(int[] arr, int k) {
		
		for(int i = 0; i < arr.length; i = i + k) {
			
			int start = i;
			int end = Math.min(i+k-1, arr.length-1);
			
			while(start <= end) {
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
				
			}
		
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		ReverseArrayInGroups obj = new ReverseArrayInGroups();
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		obj.reverse(a, 3);
		
	}
}
