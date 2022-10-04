package Array;
import java.util.HashMap;

public class GetPairCount{
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
         for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i]))
             count+=map.get(k-arr[i]);
             map.put(arr[i],map.get(arr[i])==null?1:map.get(arr[i])+1);
         }
         return count;
     }
}