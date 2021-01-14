package LeetCode.Easy;

import java.util.HashMap;

public class Q575 {
    public int distributeCandies(int[] candies) {
        int len = candies.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int n : candies) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        if( map.size() >= len/2 ){
            return len/2;
        } else {
            return map.size();
        }
    }
}
