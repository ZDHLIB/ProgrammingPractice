package Easy;

import java.util.HashMap;

public class Q645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int i = 1; i <= nums.length; i++){
            if( map.containsKey(i) && map.get(i) == 2 ){
                res[0] = i;
            } else if( !map.containsKey(i) ){
                res[1] = i;
            }
        }
        return res;
    }

    public int[] findErrorNums2(int[] nums) {
        int[] res = new int[2];
        int xor = 0, xor0 = 0, xor1 = 0;
        for(int n : nums){
            xor ^= n;
        }
        for(int i = 1; i <= nums.length; i++){
            xor ^= i;
        }
        // xor is a xor of duplicated and missing number, we need to seperate them
        // 1 means different, 0 means same bit. rightMostBit is the right most 1 bit.
        int rightMostBit = xor & ~(xor - 1);
        for(int n : nums){
            if( (n & rightMostBit) != 0 ){
                xor0 ^= n;
            }else{
                xor1 ^= n;
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if( (i & rightMostBit) != 0 ){
                xor0 ^= i;
            }else{
                xor1 ^= i;
            }
        }
        for(int n : nums){
            if( n == xor1 ){
                res[0] = n;
                res[1] = xor0;
                return res;
            }
        }

        res[0] = xor0;
        res[1] = xor1;
        return res;
    }
}
