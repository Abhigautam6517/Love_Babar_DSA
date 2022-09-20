package Array;

public class ContinuousSubarraySum {
    public static int subarraySum(int arr[], int n){
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0;i<n;i++){
            currSum = currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }

        }
        return maxSum;

    }
    public static void main(String[] args) {
            int arr[] ={1,2,3,-2,5};
            int n = arr.length;
           System.out.println(subarraySum(arr,n));
        
    }
    
}
