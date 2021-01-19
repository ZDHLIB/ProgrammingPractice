package LeetCode.DynamicProgramming;

import java.util.stream.IntStream;

public class Q877 {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int[][] dp = new int[len][len];

        for(int i = 0; i < len; i++){
            dp[i][i] = piles[i];
        }

        for(int size = 1; size < len; size++){
            for(int i = 0; i < len-size; i++){
                int j = i + size;
                if(size == 1){
                    dp[i][j] = Math.max(dp[i][i], dp[j][j]);
                } else {
                    dp[i][j] = Math.max(piles[i] + Math.min(dp[i+1][j-1], dp[i+2][j]),
                            piles[j] + Math.min(dp[i+1][j-1], dp[i][j-2]));
                }
            }
        }

        int sum = IntStream.of(piles).sum();
        return dp[0][len-1] > sum/2;
    }
}
