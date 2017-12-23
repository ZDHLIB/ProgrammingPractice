package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q88Test {
    @Test
    public void merge() throws Exception {
        int[] a = new int[]{0};
        int[] b = new int[]{1};
        Q88 q88 = new Q88();
        q88.merge(a,0,b,1);
    }

}