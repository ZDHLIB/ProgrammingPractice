package LeetCode.DynamicProgramming;

public class Q338 {
    public int[] countBits(int num) {
        if(num == 0) return new int[1];
        if(num == 1) return new int[]{0, 1};
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;

        int i = 2;
        int square = 2;
        int power = (int)Math.pow(2, square);
        int count = 0;
        while(power <= num){
            count = power - i;
            for(int n = 0; n < count; n++){
                dp[i++] = 1 + dp[n];
            }
            power = (int)Math.pow(2, ++square);
        }
        count = num - i;
        for(int n = 0; n <= count; n++){
            dp[i++] = 1 + dp[n];
        }
        return dp;
    }
}
