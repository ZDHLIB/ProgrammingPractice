package LeetCode.DynamicProgramming;

public class Q1140 {

    private int[][] dp;
    public int stoneGameII(int[] piles) {
        int len = piles.length;
        dp = new int[len][len+1];
        int total = 0;
        for(int i = 0; i < len; i++){
            total += piles[i];
        }
        int res = helper(len, piles, 0, 1);
        return (total + res) / 2;

    }

    private int helper(int len, int[] piles, int s, int M){
        if(s >= len) return 0;

        M = Math.min(M, len);
        if(dp[s][M] > 0) return dp[s][M];

        if(s + 2 * M >= len) {
            int sum = 0;
            for(int i = s; i < len; i++){
                sum += piles[i];
            }
            dp[s][M] = sum;
            return dp[s][M];
        }

        int best = Integer.MIN_VALUE;
        int curr = 0;
        for(int x = 1; x <= 2 * M; x++){
            curr += piles[s + x - 1];
            best = Math.max(best, curr - helper(len, piles, s + x, Math.max(x, M)));
        }
        dp[s][M] = best;
        return dp[s][M];
    }

}
