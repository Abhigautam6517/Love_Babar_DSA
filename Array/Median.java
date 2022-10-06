package Array;

import java.util.Arrays;

public class Median {

    public int find_median(int[] v)
    {
        int n = v.length;
        Arrays.sort(v);
        
        if(n%2!=0){
            return v[n/2];
        }
        return (v[n/2]+v[(n/2)-1])/2;
        
    }
    
}
