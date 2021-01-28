package LeetCode.DynamicProgramming;

public class Q516 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            dp[i][i] = 1;
        }
        for(int size = 1; size < n; size++){
            for(int i = 1; i + size <= n; i++){
                int j = i + size;
                if(s.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i+1][j-1] + 2);
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[1][n];
    }
}
