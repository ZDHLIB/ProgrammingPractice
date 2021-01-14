package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Q697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 1;
        for(int i=0; i < nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
            if(m.get(nums[i]) + 1 > count) {
                count = m.get(nums[i]);
            }

        }
        int res = nums.length, n = 0;
        for(Map.Entry entry : m.entrySet()) {
            int left = 0, right = 0;
            if(entry.getValue().equals(count)) {
                n = (int)entry.getKey();
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == n) {
                        left = i;
                        break;
                    }
                }
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == n) {
                        right = i;
                        break;
                    }
                }
                res = Math.min(res, right-left+1);
            }
        }
        return res;
    }
}
