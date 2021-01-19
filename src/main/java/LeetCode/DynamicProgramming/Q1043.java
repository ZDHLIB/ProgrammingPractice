package LeetCode.DynamicProgramming;

public class Q1043 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int len = arr.length;
        int[] dp = new int[len+1];

        for(int i = 1; i <= len; i++){
            int m = Integer.MIN_VALUE;
            for(int j = 1; j <= Math.min(i, k); j++){
                m = Math.max(m, arr[i-j]);
                dp[i] = Math.max(dp[i], dp[i-j] + m * j);
            }
        }

        return dp[len];
    }
}
