package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if( m.containsKey(target - nums[i]) ){
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                return res;
            } else {
                m.put(nums[i], i);
            }
        }
        return res;
    }
}
