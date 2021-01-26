package LeetCode.DynamicProgramming;

public class Q1706 {
    private int[] res;
    private int rows;
    private int cols;
    public int[] findBall(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        res = new int[cols];
        for(int i = 0; i < cols; i++) res[i] = i;
        solver(grid, 0);
        return res;
    }

    private void solver(int[][] grid, int row) {
        if(row == rows) return;

        for(int i = 0; i < cols; i++) {
            int j = res[i];
            if(j == -1) continue;

            if(grid[row][j] == 1) {
                if(j == cols - 1 || grid[row][j+1] == -1){
                    res[i] = -1;
                } else {
                    res[i]++;
                }
            } else {
                if(j == 0 || grid[row][j-1] == 1){
                    res[i] = -1;
                } else {
                    res[i]--;
                }
            }
        }
        // System.out.println(Arrays.toString(res));
        solver(grid, row + 1);
    }
}
