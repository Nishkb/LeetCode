package array;
import java.util.*;

public class CheckIFArraysAreEqual {

	public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long, Integer> set = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            set.put(A[i], i);
            System.out.println(set.get(A[i]));
            System.out.println();
        } 
        
        HashMap<Long, Integer> set2 = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            set2.put(B[i], i);
            System.out.println(set2.get(B[i]));
        }
        
        //System.out.println(set.get(B[i]));
        //System.out.println(set2.get(A[i]));

        if(set.equals(set2)){
            return true;
        }
        
        else{
            return false;
        }
        
        
        
        	//System.out.print(set);
        
    }
	
	public static void main(String[] args) {
		long a[] = {1, 2, 3, 4, 5};
		long b[] = {2, 4, 5, 0, 1};
		System.out.println(check(a, b, 5));
	
	}
	
}
