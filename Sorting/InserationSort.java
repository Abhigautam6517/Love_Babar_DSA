public class InserationSort {
    private static void insertion(int[] arr, int n) {
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {34,11,5,8,6,12,9,2};
        int n = arr.length;
        insertion(arr,n);
        printArray(arr,n);

    }
    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

   
    
}
