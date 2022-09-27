package Array;

public class KadaneAlgorithm {
    static long maxSubarraySum(int arr[], int n){

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            curSum = curSum + arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
                
            }
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,5,-6,-7,1,2,-9};
        int n = arr.length;
        maxSubarraySum(arr,n);
        
    }
    
}
