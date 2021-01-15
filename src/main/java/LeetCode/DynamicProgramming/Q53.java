package LeetCode.DynamicProgramming;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        int[] dp = new int[len+1];


//         dp[0][1] = Math.max(dp[1][1], dp[0][0]+nums[1]);
//         dp[0][2] = Math.max(dp[2][2], dp[0][1]+nums[2]);
//         dp[0][3] = Math.max(dp[3][3], dp[0][2]+nums[3]);
        dp[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
