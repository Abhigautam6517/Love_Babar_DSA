package Array;

public class MaxProductSunbrray {
    long maxProduct(int[] arr, int n) {
        // code here
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        
        for(int i=1;i<n;i++){
           if(arr[i]==0){
               max=1;
               min=1;
               continue;
           }
           long temp1 = arr[i]*max;
           long temp2 = arr[i]*min;
           max = (int) Math.max(temp1,temp2);
           max = Math.max(max,arr[i]);
           min = (int) Math.min(temp1,arr[i]);
           min = (int) Math.min(min,temp2);
           res = Math.max(res,max);
            
        }
        return max;
    }
    
}
