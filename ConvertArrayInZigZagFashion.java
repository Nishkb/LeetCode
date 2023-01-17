package array;

public class ConvertArrayInZigZagFashion {

	public void convert(int[] a, int n) {
	
	//int count = 0;
	
	for(int i = 0; i < a.length-1; i++) {
		
		if(i % 2 == 0) {
			if( a[i] < a[i+1]) {
				
			}
			else {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		
		else {
			if(a[i] > a[i+1]) {
				
			}
			
			else { int temp = a[i];
					a[i] = a[i + 1];
					a[i+1] = temp;
			}
		}
		//count++;
	}
	
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	}
	
	public static void main(String[] args) {
		
		ConvertArrayInZigZagFashion obj = new ConvertArrayInZigZagFashion();
		int[] a = {4, 3, 7, 8, 6, 2, 1};
		obj.convert(a, 7);
		
		
	}
}
