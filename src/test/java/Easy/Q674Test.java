package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q674Test {
    @Test
    public void findLengthOfLCIS() throws Exception {
        int[] a = new int[]{1,3,5,4,7};
        Q674 q674 = new Q674();
        System.out.print(q674.findLengthOfLCIS(a));
    }

}