package Easy;

import java.util.Arrays;

public class Q561 {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2){
            res += nums[i];
        }
        return res;
    }
}
