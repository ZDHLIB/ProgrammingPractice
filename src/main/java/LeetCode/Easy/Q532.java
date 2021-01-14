package LeetCode.Easy;

import java.util.Arrays;

public class Q532 {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);

        for(int i = 0, j = i+1; i < nums.length-1 && j < nums.length; ){
            if( nums[j] - nums[i] == k ){
                count++;
                while(i+1 < nums.length && nums[i] == nums[i+1]){
                    i++;
                }
                i++;
                j = i + 1;
            } else if ( nums[j] - nums[i] < k ){
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        return count;
    }
}
