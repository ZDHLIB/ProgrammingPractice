package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class Q413 {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        int[][] dp = new int[n][n];
        if(n<3) return 0;

        for(int size = 2; size < n; size++){
            for(int i = 0; i + size < n; i++){
                int j = i + size;
                if(isArithmetric(A, i, j)){
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1;
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[0][n-1];
    }

    private boolean isArithmetric(int[] A, int start, int end){
        int gap = A[start+1] - A[start];
        for(int i = start + 1; i <= end; i++){
            if(A[i] - A[i-1] != gap) return false;
        }
        return true;
    }

    public int numberOfArithmeticSlices2(int[] A) {
        int[] dp = new int[A.length];
        int sum = 0;
        for (int i = 2; i < dp.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = 1 + dp[i - 1];
                sum += dp[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Q413 q = new Q413();
        q.numberOfArithmeticSlices(new int[]{1,2,3,4});
    }
}
