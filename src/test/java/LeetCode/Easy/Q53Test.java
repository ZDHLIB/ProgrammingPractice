package LeetCode.Easy;

import org.junit.jupiter.api.Test;

public class Q53Test {
    @Test
    public void maxSubArray() throws Exception {
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Q53 q53 = new Q53();
        System.out.print(q53.maxSubArray(a));
    }

}