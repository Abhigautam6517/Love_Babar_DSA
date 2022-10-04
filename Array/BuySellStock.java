package Array;
public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int sum = 0;
        int maxProfit = 0;
        
        for(int i=1;i<prices.length;i++) {
            sum += (prices[i] - prices[i-1]);
            if(sum > maxProfit) {
                maxProfit = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        maxProfit(arr);
    }
    
}
