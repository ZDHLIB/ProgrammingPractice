package LeetCode.Easy;

public class Q674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int res = 1, tmp = 1;
        for(int i = 0; i < nums.length-1; i++){
            if( nums[i+1] > nums[i] ){
                tmp++;
                res = Math.max(res, tmp);
            }else {
                tmp = 1;
            }
        }
        return res;
    }
}
