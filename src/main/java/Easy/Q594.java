package Easy;

import java.util.HashMap;

public class Q594 {
    public int findLHS(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
            if( map.containsKey(n-1) ){
                res = Math.max(res, map.get(n) + map.get(n-1));
            }
            if( map.containsKey(n+1) ){
                res = Math.max(res, map.get(n) + map.get(n+1));
            }
        }
        return res;
    }
}
