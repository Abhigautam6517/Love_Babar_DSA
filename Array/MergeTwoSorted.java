package Array;

public class MergeTwoSorted {
    public static void merge(int arr1[], int arr2[], int n1, int n2){
        int c = 0;
        int p = n1+n2;
        int arr3[] = new int[p];
        for (int i = 0;i<n1;i++){
            arr3[c]=arr1[i];
            c++;
        }
         
        for (int j =0 ;j<n2;j++){
            arr3[c]=arr2[j];
            c++;
        }
        printArray(arr3, p);
    }
    static void printArray(int arr2[], int n){
        for(int i = 0;i<n;i++){
            System.out.println("the array is"+arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4};
        int arr2[]={5,6,7,8};
        int n1 = arr1.length;
        int n2 = arr1.length;
        merge(arr1,arr2,n1,n2);
    }
    
}
