package Array;
public class Sort0s1s2s {
    public static void Arrange(int arr[], int n){
        int arr2[]  = new int[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                arr2[count++] = arr[i];
            }

        }
        int j = count;
        for(int i = 0;i<n;i++){
            if(arr[i]==1){
                arr2[j++] = arr[i];
            }
        }
        int k = j;
        for(int i = 0;i<n;i++){
            if(arr[i]==2){
                arr2[k++] = arr[i];
            }
            
        }
        printArray(arr2,n);
    }
    static void printArray(int arr2[], int n){
        for(int i = 0;i<n;i++){
            System.out.println("the array is"+arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,1,0,1,2,0,0,2};
        int n = arr.length;
        Arrange(arr,n);
    }
    
}
