package Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int n : nums1){
            map.put(n,map.getOrDefault(n, 0) + 1);
        }
        for(int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                res.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        int i = 0;
        int[] result = new int[res.size()];
        for(int n : res){
            result[i++] = n;
        }
        return result;
    }
}
