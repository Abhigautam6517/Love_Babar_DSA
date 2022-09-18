package Array;

import java.util.Arrays;
import java.util.List;

public class MaxandMinElement {
    public static List<Integer> minmax(int arr[],int n){
        int max = arr[0];
        int min =  arr[0];
        for(int i = 1;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
          
        }
        
        return Arrays.asList(max,min);
       
        
    }
    public static void main(String[] args) {
        int arr[] ={56,12,45,87,56,98,20,14};
        int n = arr.length;
        System.out.println( minmax(arr,n));

    }
    
}
