package Array;

import java.util.Arrays;

public class KthMin {
    static int kmax(int arr[], int n, int k){
        Arrays.sort(arr);
        System.out.println(arr[k]);
        return k;
    }
    public static void main(String[] args) {
        int arr [] ={40,85,20,12,45,12,45};
        int n = arr.length;
        int k = 2;
        System.out.println( kmax(arr,n,k));

    }
    
}
