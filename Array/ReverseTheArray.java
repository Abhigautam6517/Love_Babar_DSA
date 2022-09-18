package Array;
public class ReverseTheArray{
    // Brute force approach //

    // static void reverse(int arr[], int n){
    //    int arr2 [] = new int [n];
    //    int j = 0;
    //    for(int i = n-1;i>=0;i--){
    //     arr2[j]=arr[i];
    //     j++; 
    //    }
    //    printArray(arr2,n);
        
    // }

    // Optimized Way

     static void reverse(int arr[], int n){
        int start = 0;
        int temp;
        int end = n-1;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end]; 
            arr[end]=  temp;
            start++;
            end--;     
        }
        printArray(arr, n);
     }
    static void printArray(int arr2[], int n){
        for(int i = 0;i<n;i++){
            System.out.println("the array is"+arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={9,5,4,2,3,21,15};
        int n = arr.length;
        reverse(arr,n);
       

    }
}