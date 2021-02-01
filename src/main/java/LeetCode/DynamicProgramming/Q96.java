package LeetCode.DynamicProgramming;

public class Q96 {
    public int numTrees(int n) {
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            dp[i][i] = 1;
        }

        for(int size = 1; size < n; size++){
            for(int i = 0; i + size < n; i++){
                int j = i + size;
                dp[i][j] = dp[i][j-1] + dp[i+1][j];
                for(int k = i + 1; k < j; k++){
                    dp[i][j] += dp[i][k-1] * dp[k+1][j];
                }
            }
        }
        // for(int i = 0; i < n; i++){
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        return dp[0][n-1];
    }
}
