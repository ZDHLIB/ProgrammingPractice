package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q283Test {
    @Test
    public void moveZeroes() throws Exception {
        int[] a = new int[]{0, 1, 0, 3, 12};
        Q283 q283 = new Q283();
        q283.moveZeroes(a);
    }

}