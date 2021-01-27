package LeetCode.DynamicProgramming;

public class Q64 {
    int res = 0;
    int rows;
    int cols;
    int[][] dp;
    public int minPathSum(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        if(rows == 1 && cols == 1) return grid[0][0];

        dp = new int[rows][cols];

        int rightSum = grid[0][0] + findShortestPath(0, 1, grid);
        int downSum = grid[0][0] + findShortestPath(1, 0, grid);

        return Math.min(rightSum, downSum);
    }

    private int findShortestPath(int i, int j, int[][] grid){
        if(i == rows-1 && j == cols-1) return grid[i][j];
        if(i >= rows || j >= cols) return 1000;
        int rightSum = 0, downSum = 0;

        if(dp[i][j] > 0) return dp[i][j];

        rightSum = grid[i][j] + findShortestPath(i, j+1, grid);
        downSum = grid[i][j] + findShortestPath(i+1, j, grid);

        dp[i][j] = Math.min(rightSum, downSum);

        return dp[i][j];
    }
}
