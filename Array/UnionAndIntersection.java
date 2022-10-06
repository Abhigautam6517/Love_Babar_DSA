package Array;

public class UnionAndIntersection {
    public static void union(int arr1[], int arr2[], int m, int n){
       int i = 0;
       int j = 0;
       int k= 0;
       int l = 0;
       int p = n+m;
       int a[] = new int[p];
       int b[] = new int[m];
       while(i<m && j<n){
        if(arr1[i]<arr2[j]){
            a[k] = arr1[i];
            k++;
            i++;
        }
        else if(arr1[i]>arr2[j]){
            a[k] = arr2[j];
            k++;
            j++;
        }
        else if(arr1[i]==arr2[j]){
            b[l] = arr1[i];
            a[k] = arr1[i];
            l++;
            j++;
            k++;
            i++;
        }

       }
       while(i<m-1){
        a[k]=arr1[i];
        k++;
        i++;
       }
       while(j<n){
        a[k]=arr2[j];
        k++;
        j++;
       }
       printArray(a,b, p, n);
    }
    public static void printArray(int a[], int b[], int p , int n){
        for(int i=0;i<p;i++){

            System.out.println("The Union is "+" "+a[i]);
        }
        for(int i=0;i<n-1;i++){
            System.out.println("The Intersection is "+" " +b[i]);
        }
    }
    public static void main(String[] args) {
       int arr1[] = {1, 3, 4, 5, 7};
       int arr2[] = {2, 3, 5, 6};
       int m = arr1.length-1;
       int n = arr2.length-1;
       union(arr1,arr2,m,n);

    }

    
    
}
