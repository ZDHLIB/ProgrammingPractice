package Easy;

import org.junit.jupiter.api.Test;

public class Q532Test {
    @Test
    public void findPairs() throws Exception {
        int[] a = new int[]{1, 3, 1, 5, 4};
        Q532 q532 = new Q532();
        System.out.print(q532.findPairs(a, 0));
    }

}