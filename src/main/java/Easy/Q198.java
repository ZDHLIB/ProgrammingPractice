package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0],nums[1]);
        int[] res = new int[len];
        res[0] = nums[0];
        res[1] = Math.max(res[0], nums[1]);
        for(int i = 2; i < len; i++){
            res[i] = Math.max( res[i-2] + nums[i], res[i-1] );   
        }
        return res[len-1];
    }
}
