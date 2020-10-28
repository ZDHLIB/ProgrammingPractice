package Easy;

import org.junit.jupiter.api.Test;

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