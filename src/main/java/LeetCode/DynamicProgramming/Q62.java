package LeetCode.DynamicProgramming;

public class Q62 {
    int rows, cols;
    int[][] dp;
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1) return 1;
        rows = m;
        cols = n;
        dp = new int[m][n];
        int res = paths(0, 0);
        return res;
    }

    private int paths(int m, int n){
        if(m >= rows || n >= cols) return 0;
        if(m == rows-1 && n == cols-1) return 1;

        if(dp[m][n] > 0) return dp[m][n];

        int right = paths(m, n+1);
        int down = paths(m+1, n);

        dp[m][n] = right + down;

        return dp[m][n];
    }
}
