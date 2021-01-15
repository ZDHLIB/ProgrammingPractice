package LeetCode.DynamicProgramming;

public class Q1025 {
    public boolean divisorGame(int N) {
        boolean[][] dp = new boolean[N+1][N+1];
        // dp[1][0] = false;
        // dp[2][1] = true;
        // dp[3][1] = !dp[2][1] = false;
        // dp[4][1] = !dp[3][1] = true;
        // dp[4][2] = !dp[2][1] = false;
        if(N == 1) return false;
        if(N == 2) return true;
        dp[1][0] = false;
        dp[2][1] = true;
        for(int i = 3; i <= N; i++ ){
            for(int j = i-1; j >= 1; j--){
                if(i % j == 0){
                    dp[i][j] |= !dp[i-j][j];
                }
            }
        }
        boolean res = false;
        for(int i = 1; i <= N; i++){
            res |= dp[N][i];
        }
        return res;
    }

    public boolean divisorGame2(int N) {
        boolean[] dp = new boolean[N+1];
        if(N == 1) return false;
        if(N == 2) return true;
        dp[1] = false;
        dp[2] = true;
        for(int i = 3; i <= N; i++ ){
            for(int j = 1; j*j < i; j++){
                if(i % j == 0){
                    dp[i] |= !dp[i-j];
                }
            }
        }
        return dp[N];
    }
}
