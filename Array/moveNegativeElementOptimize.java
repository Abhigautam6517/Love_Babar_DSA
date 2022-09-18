package Array;
public class moveNegativeElementOptimize {
    public static void moveNegative(int arr[], int n){
        int arr2[] = new int[n];
        int pos = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                arr2[pos]=arr[i];
                pos++;
            }
        }
        int neg = pos;
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                arr2[neg]=arr[i];
                neg++;
            }
        }
        for(int i = 0;i<n;i++){
           arr[i] = arr2[i];
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
