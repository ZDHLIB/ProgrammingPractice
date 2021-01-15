package LeetCode.DynamicProgramming;

public class Q746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];
        if(len <= 1) return 0;

        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < len; i++){
            dp[i] = Math.min(dp[i-2]+cost[i], dp[i-1]+cost[i]);
        }
        dp[len] = Math.min(dp[len-2], dp[len-1]);
        return dp[len];
    }

    public int minCostClimbingStairs2(int[] cost) {
        int len = cost.length;
        if(len <= 1) return 0;

        int cost_step1 = cost[0];
        int cost_step2 = cost[1];
        int final_cost = 0;
        for(int i = 2; i < len; i++){
            final_cost = Math.min(cost_step1+cost[i], cost_step2+cost[i]);
            cost_step1 = cost_step2;
            cost_step2 = final_cost;
        }
        return Math.min(cost_step1, cost_step2);
    }
}
