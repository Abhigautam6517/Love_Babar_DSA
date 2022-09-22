package Array;

public class MergeTwoSortedWitoutSpace {
   
    static void merge(int[] arr1, int arr2[], int n, int m) {
        // code here
        int i, k;
        for (i = 0; i < n; i++) {
          // take first element from arr1 
          // compare it with first element of second array
          // if condition match, then swap
          if (arr1[i] > arr2[0]) {
            int temp = arr1[i];
            arr1[i] = arr2[0];
            arr2[0] = temp;
          }
    
          // then sort the second array
          // put the element in its correct position
          // so that next cycle can swap elements correctly
          int first = arr2[0];
          // insertion sort is used here
          for (k = 1; k < m && arr2[k] < first; k++) {
            arr2[k - 1] = arr2[k];
          }
          arr2[k - 1] = first;
        }
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

    
