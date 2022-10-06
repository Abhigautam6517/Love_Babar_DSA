package Array;

import java.util.ArrayList;

public class DuplicateElement {
    public static ArrayList<Integer> duplicate(int arr[], int n){
        ArrayList<Integer> dup = new ArrayList<>();
        int element;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    element = arr[i];
                    dup.add(element);
                }
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
