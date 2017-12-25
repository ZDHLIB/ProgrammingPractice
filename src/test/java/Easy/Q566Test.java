package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q566Test {
    @Test
    public void matrixReshape() throws Exception {
        int[][] a = new int[][]{
                {1,2,3,4},
                {5,6,7,8}
        };
        Q566 q566 = new Q566();
        q566.matrixReshape(a,2,4);
    }

}