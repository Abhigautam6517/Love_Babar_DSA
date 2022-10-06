package Array;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) { 
        int leftmax [] = new int [n];
        int rightmax[] = new int[n];
        leftmax[0]=arr[0];
        long totalwater = 0;
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
        }
        // int water = 0;
       
        for(int i=0;i<n;i++){
            long water = (Math.min(leftmax[i],rightmax[i])-arr[i]);
            totalwater+=water;
        }
        return totalwater;
    }
}


