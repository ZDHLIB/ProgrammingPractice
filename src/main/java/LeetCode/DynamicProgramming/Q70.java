package LeetCode.DynamicProgramming;

public class Q70 {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    public int climbStairs2(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int first = 1, second = 2, third = 0;
        for(int i = 3; i <= n; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
