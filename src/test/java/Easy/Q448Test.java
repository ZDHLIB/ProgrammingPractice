package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q448Test {
    @Test
    public void findDisappearedNumbers() throws Exception {
        int[] a = new int[]{4,3,2,7,8,2,3,1};
        Q448 q448 = new Q448();
        System.out.println(q448.findDisappearedNumbers(a));
    }

}