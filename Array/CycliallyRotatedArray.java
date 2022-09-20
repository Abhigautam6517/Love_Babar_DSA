package Array;

public class CycliallyRotatedArray {
    static void rotate(int[] arr, int n){
        int key = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = key;
        printArray(arr,n);
    }
    public static void printArray(int arr[], int n){
        for(int i = 0;i<n;i++){
            System.out.println("Rotate array is" +arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        rotate(arr,n);
    }
    
}
