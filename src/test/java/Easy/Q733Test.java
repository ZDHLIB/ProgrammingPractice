package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q733Test {
    @Test
    public void floodFill() throws Exception {
        int[][] a = new int[][]{
                {0,0,0},
                {0,1,1}
        };
        Q733 q733 = new Q733();
        q733.floodFill(a, 1, 1, 1);
    }

}