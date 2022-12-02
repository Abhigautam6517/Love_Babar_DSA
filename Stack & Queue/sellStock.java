class sellStock {
    public static int maxProfit(int[] prices) {
    int buy = Integer.MAX_VALUE;
    int fProfit = 0;
    int temp = 0;
    
        for(int i = 0; i < prices.length; i++){
            //taking smallest buy value
            if(prices[i] < buy){
                buy = prices[i];
            }
            //current price bigger then last price then only update
            temp = prices[i] - buy;
            if(fProfit < temp){
                fProfit = temp;
            }
        }
        return fProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        maxProfit(arr); 
    }
}
    