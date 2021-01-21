package LeetCode.DynamicProgramming;

public class Q1504 {
    public int numSubmat(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dp = new int[rows+1][cols+1];
        int ans = 0;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(mat[i-1][j-1] == 1){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
                    int k = 0;
                    int p = 0;
                    int kBound = 0;
                    int pBound = 0;
                    while(j - p > pBound){
                        while(i - k > kBound){
                            if(mat[i-k-1][j-p-1] == 1) dp[i][j]++;
                            else {
                                kBound = i - k;
                            }
                            k++;
                        }
                        k = 0;
                        p++;
                    }
                } else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
                }
            }
        }

        return dp[rows][cols];
    }

    public int numSubmat2(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] height = new int[cols];
        int ans = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] != 0){
                    height[j] += 1;
                } else {
                    height[j] = 0;
                }
                for(int k = j, m = height[j]; k >= 0 && m > 0; k--){
                    m = Math.min(m, height[k]);
                    ans += m;
                }
            }
        }

        return ans;
    }
}
