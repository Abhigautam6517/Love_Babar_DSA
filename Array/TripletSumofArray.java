package Array;

import java.util.HashSet;

public class TripletSumofArray {
    

        public static boolean find3Numbers(int A[], int n, int X) { 
           for(int i = 0;i<n-2;i++){
               HashSet<Integer> set  = new HashSet<>();
               int tofind = X-A[i];
               for(int j = i+1;j<n;j++){
                   if(set.contains(tofind-A[j])){
                       return true;
                   }
                   set.add(A[j]);
               }
           }
           return false;
        
        }
    
}
