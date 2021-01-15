package LeetCode.DynamicProgramming;

public class Q303 {
    private long[] sums;
    public Q303(int[] nums) {
        sums = new long[nums.length+1];
        for(int i = 1; i <= nums.length; i++){
            sums[i] = sums[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return (int)(this.sums[j+1] - this.sums[i]);
    }
}
