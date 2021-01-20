package LeetCode.DynamicProgramming;

public class Q931 {
    public int minFallingPathSum(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] dp = new int[rows+2][cols+2];

        for(int i = 0; i <= rows+1; i++){
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][cols+1] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                int m = Math.min(dp[i-1][j-1], dp[i-1][j]);
                m = Math.min(m, dp[i-1][j+1]);
                dp[i][j] = m + A[i-1][j-1];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 1; i <= cols; i++){
            res = Math.min(dp[rows][i], res);
        }
        return res;
    }
}
