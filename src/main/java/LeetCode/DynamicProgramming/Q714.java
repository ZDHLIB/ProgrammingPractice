package LeetCode.DynamicProgramming;

public class Q714 {
     public int maxProfit(int[] prices, int fee) {
         int n = prices.length;
         if(n <= 1) return 0;
         int[][] dp = new int[n][2];

         dp[0][1] = -prices[0];
         for(int i = 1; i < n; i++){
             dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i] - fee);
             dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
         }

         return dp[n-1][0];
     }

    public int maxProfit2(int[] prices, int fee) {
        int n = prices.length;
        if(n <= 1) return 0;
        int dp_i_0 = 0, dp_i_1 = -prices[0];

        for(int i = 1; i < n; i++){
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i] - fee);
            dp_i_1 = Math.max(dp_i_1, dp_i_0 - prices[i]);
        }

        return dp_i_0;
    }
}
