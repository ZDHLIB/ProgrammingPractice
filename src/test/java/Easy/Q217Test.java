package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q217Test {
    @Test
    public void containsDuplicate() throws Exception {
        int[] a = new int[]{-2,3,-4,0,5,5,9};
        Q217 q217 = new Q217();
        System.out.println(q217.containsDuplicate(a));
    }

}