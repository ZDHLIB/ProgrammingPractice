package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q122Test {
    @Test
    public void maxProfit() throws Exception {
        int[] a = new int[]{1,4,3,2};
        Q122 q122 = new Q122();
        System.out.println(q122.maxProfit2(a));
    }

}