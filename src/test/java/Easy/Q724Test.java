package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q724Test {
    @Test
    public void pivotIndex() throws Exception {
        int[] a = new int[]{1, 7, 3, 6, 5, 6};
        Q724 q724 = new Q724();
        System.out.println(q724.pivotIndex(a));
    }

}