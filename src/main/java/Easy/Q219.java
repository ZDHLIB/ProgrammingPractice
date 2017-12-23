package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if( i > k ){
                s.remove(nums[i-k-1]);
            }
            if(!s.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
