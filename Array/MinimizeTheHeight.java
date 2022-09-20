package Array;

import java.util.Arrays;

import java.lang.Math;

public class MinimizeTheHeight {
    private static final int Math = 0;
    public static int MinimizeHeight(int arr[], int n){
        int k = 2;
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];

        int min, max;
        for(int i = 1;i<n;i++){
            max = Math.max((arr[i-1]+k , arr[n-1]-k));
            min = Math.min((arr[0]+k, arr[i]-k));
            diff =Math.min((diff, max-min));

        }
        return diff;
        

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        System.out.println( MinimizeHeight(arr,n));
    }
    
}
