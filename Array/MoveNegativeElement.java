package Array;
public class MoveNegativeElement {
    public static void moveNegative(int arr[], int n){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
                j++;
            }
        }
        printArray(arr, n);
    }
    static void printArray(int arr2[], int n){
        for(int i = 0;i<n;i++){
            System.out.println("the array is"+arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,-1,6,8,-21,-3};
        int n = arr.length;
        moveNegative(arr,n);
    }
    
}
