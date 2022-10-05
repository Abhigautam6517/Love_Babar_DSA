package Array;

import java.util.Arrays;
import java.util.HashSet;

public class LonestSubsequence {
   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   HashSet<Integer> hs = new HashSet<>();
	   
	   for(int i=0;i<N;i++){
	       hs.add(arr[i]); //adding the element into hashset
	   }
	   int ans=0;
	   for(int i=0;i<N;i++){
	       if(!hs.contains(arr[i]-1)){//set the first elm
	           int curr = arr[i];
	           int count=1;  
	           while(hs.contains(curr+1)){//next elments
	               curr++;
	               count++;
	           }
	       
	       ans=Math.max(ans,count);
	       }
	   }
	   return ans;
	   
	}
    public static void main(String[] args) {
        int arr [] ={1,9,2,4,3,6,5};
        int n = arr.length;
        findLongestConseqSubseq(arr,n);

    }
    
}
