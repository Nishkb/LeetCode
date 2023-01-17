package array;

public class GetMinMax {
	
	class pair  
	{  
	    long first, second;  
	    public pair(long first, long second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
	}

	 pair getMinMax(long a[], long n)  
    {
		
        //Write your code here
        long max = a[0];
        long min = a[0];
        
        pair minmax = new pair(min, max);
        
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
//                minmax.second = max;
                max = a[i];
            }
            
            else if(a[i] < min){
               // minmax.first = a[i];
                min = a[i];
                
            } else{
                break;
            }
        minmax.first = min;
        minmax.second = max;
            
        }
        
        
        return minmax;
    }
	
}
