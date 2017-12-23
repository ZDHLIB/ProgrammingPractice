package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q605Test {
    @Test
    public void canPlaceFlowers() throws Exception {
        int[] a = new int[]{1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,1};
        Q605 q605 = new Q605();
        System.out.println(q605.canPlaceFlowers(a,4));
    }

}