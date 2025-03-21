class StockProfit {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        
       
        int maxProfit = findMaxProfit(prices);
        
        
        System.out.println("Maximum Profit: " + maxProfit);
    }
    
    public static int findMaxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;  
        }
        
        int minPrice = prices[0];  
        int maxProfit = 0; 
        
        
        for (int i = 1; i < prices.length; i++) {
           
            int profit = prices[i] - minPrice;
            
           
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            
           
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        
        return maxProfit;  
    }
}

