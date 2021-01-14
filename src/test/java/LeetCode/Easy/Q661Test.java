package LeetCode.Easy;

import org.junit.jupiter.api.Test;

public class Q661Test {
    @Test
    public void imageSmoother() throws Exception {
        int[][] a = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        Q661 q661 = new Q661();
        int[][] res = q661.imageSmoother(a);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

}