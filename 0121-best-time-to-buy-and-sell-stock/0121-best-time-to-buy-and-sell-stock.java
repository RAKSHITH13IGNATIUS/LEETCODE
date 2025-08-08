class Solution {
    public int maxProfit(int[] price) {
        int Buy_price = price[0];
        int profit =0;
        for(int i=1;i<price.length;i++){
            if(price[i]<Buy_price){
                Buy_price = price[i];
            }
            else{
                int current_profit = price[i] - Buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
    }
