package array;

public class BinarySearchInArray {

	int search(int arr[], int left, int right, int k) {
		
		if(left > right) {
			return -1;
		}
		
		int mid = (left + right) / 2;
		
		if (arr[mid] == k) {
			return mid;
		}
		
		if(arr[mid] > k) {
			return search(arr, left, right-1, k);
		}
		
		else {
			return search(arr, left+1, right, k);
		}
	}
	
	int binarysearch(int arr[], int n, int k) {
        // code here
		return search(arr, 0, n-1, k);
}
	
	public static void main(String[] args) {
		
		BinarySearchInArray obj = new BinarySearchInArray();
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(obj.search(a, 0, a.length-1, 6));
	}
}

