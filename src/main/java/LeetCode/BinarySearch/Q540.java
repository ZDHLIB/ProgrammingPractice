package LeetCode.BinarySearch;

public class Q540 {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        int res = nums[0];
        for(int i = 1; i < len; i++){
            res ^= nums[i];
        }
        return res;
    }
}
