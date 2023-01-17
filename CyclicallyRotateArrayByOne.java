package array;

public class CyclicallyRotateArrayByOne {

	
	public void rotate(int arr[], int n)
    {
		int x = arr[arr.length - 1];
		
		for(int i = n-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = x;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
    }
	
	public static void main(String[] args) {
		
		CyclicallyRotateArrayByOne obj = new CyclicallyRotateArrayByOne();
		int a[] = {1, 2, 3, 4, 5};
		obj.rotate(a, 5);
		
	}
}
