package array;

public class SearchElement {
	
	static int search(int arr[], int N, int X)
    {
        
        // Your code here
        
        for(int i = 0; i < arr.length; i++){
            if(X == arr[i]){
                X = i;
            }
        }
        return X;
    }
}
