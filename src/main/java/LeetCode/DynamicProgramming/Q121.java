package LeetCode.DynamicProgramming;

public class Q121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len <= 1) return 0;
        int lowest = prices[0];
        int profit = 0;
        for(int i = 1; i < len; i++){
            lowest = Math.min(lowest, prices[i]);
            profit = Math.max(profit, prices[i] - lowest);
        }
        return profit;
    }
}
