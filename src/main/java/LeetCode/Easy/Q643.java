package LeetCode.Easy;

public class Q643 {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0, tmp = 0;
        for(int i = 0; i < k; i++){
            res += nums[i];
        }
        tmp = res;
        for(int i = k; i < nums.length; i++){
            tmp = tmp + nums[i] - nums[i-k];
            res = Math.max(res, tmp);
        }
        return res/k;
    }
}
