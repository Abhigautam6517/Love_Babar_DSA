package Array;

public class MinimunSwapTogether {
    public static int minSwap (int a[], int n, int k) {
        //Complete the function
           int x=0,y=0;
        
        for(int i=0;i<n;i++) if(a[i]<=k) x++;
        for(int i=0;i<x;i++)  if(a[i]<=k) y++;
        
        int mx=(x-y);
       
        
        for(int i=x;i<n;i++)
        {
            if(a[i]<=k) y++;
            if(a[i-x]<=k) y--;
            mx=Math.min(mx,x-y);
        }
        
        return mx;
    }
    
}
