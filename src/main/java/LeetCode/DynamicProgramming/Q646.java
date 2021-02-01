package LeetCode.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class Q646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int n = pairs.length;
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) dp[i] = 1;

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++){
                if(pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n-1];
    }
}
