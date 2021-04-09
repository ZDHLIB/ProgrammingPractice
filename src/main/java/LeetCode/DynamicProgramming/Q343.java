package LeetCode.DynamicProgramming;

public class Q343 {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int k = 4; k <= n; k++){
            for(int j = 2; j <= k/2; j++){
                dp[k] = Math.max(dp[k], dp[j] * dp[k-j]);
            }
        }
        return dp[n];
    }
}
