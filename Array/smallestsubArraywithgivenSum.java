package Array;

public class smallestsubArraywithgivenSum {
    public static int smallestSubWithSum(int a[], int n, int x) {
        int max = Integer.MAX_VALUE;
        int length = 0;
        int i = 0 ;
        int j = 0 ;
        if(n == 1){
            if(x < a[0]){
                return 1;
            }else{
                return 0;
            }
        }
        while(i<n){
        int sum  = 0 ;    
            if(a[i] > x){
                length = 1;
            }else{
                j = i;
                while(j<n ){
                    sum += a[j];
                    j++;
                   if(sum > x){
                     length = j-i;
                     break;
                   }
                }
            }
             max = Math.min(length,max);
            i++;
            }
        return max;
 
     }
     public static void main(String[] args) {
        int arr[]={1,4,45,6,0,19};
        int n = arr.length;
        int x = 51;
        smallestSubWithSum(arr,n,x);

     }
    
}
