package Array;



import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate2 {
    public static ArrayList<Integer> duplicate(int arr[], int n){
        ArrayList<Integer> dup = new ArrayList<>();
        
        Arrays.sort(arr);
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                int e = arr[i];
                dup.add(e);
            }
            
            
        }
        return dup;
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,3,6,1};
        int n = arr.length;
        System.out.println(duplicate(arr,n));
    }
    
}
 
    

