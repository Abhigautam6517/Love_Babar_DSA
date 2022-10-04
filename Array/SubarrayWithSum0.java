package Array;

import java.util.HashSet;

public class SubarrayWithSum0 {
    static boolean findsum(int arr[],int n)
    {
        int prefix_sum = 0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            prefix_sum += arr[i];
            if(prefix_sum==0 || s.contains(prefix_sum)){
                return true;
            }
            s.add(prefix_sum);
        }
        return false;
    } 
}
