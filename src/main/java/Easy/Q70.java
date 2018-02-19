package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q70 {
   public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int one = 2, two = 1, res = 0;
        for(int i = 2; i < n; i++){
            res = one + two;
            two = one;
            one = res;
        }
        return res;
    }
}
