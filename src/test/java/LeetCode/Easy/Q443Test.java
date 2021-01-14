package LeetCode.Easy;

import org.junit.jupiter.api.Test;

public class Q443Test {
    @Test
    public void compress() throws Exception {
        char[] chs = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        Q443 q443 = new Q443();
        System.out.println(q443.compress(chs));
    }

}