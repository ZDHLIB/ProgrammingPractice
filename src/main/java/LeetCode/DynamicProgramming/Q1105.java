package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class Q1105 {
    int rows;
    int[] memo;
    public int minHeightShelves(int[][] books, int shelf_width) {
        rows = books.length;
        int height = Integer.MAX_VALUE;
        memo = new int[rows];

        int res = split(0, books, shelf_width);

        return res;
    }

    private int split(int splitPos, int[][] books, int shelf_width) {
        if(splitPos >= rows) return 0;

        if(memo[splitPos] > 0) {
            return memo[splitPos];
        }
        int width = 0;
        int rowHeight = 0;
        int height = Integer.MAX_VALUE;
        for(int i = splitPos; i < rows; i++){
            width += books[i][0];
            if(width <= shelf_width){
                rowHeight = Math.max(rowHeight, books[i][1]);
                height = Math.min(height, rowHeight + split(i+1, books, shelf_width));
            } else {
                break;
            }
        }
        memo[splitPos] = height;
        return height;
    }

    public static void main(String[] args) {
        Q1105 q = new Q1105();
        int[][] books = new int[][]{
                {1,1}, {2,3}, {2,3}, {1,1}, {1,1}, {1,1}, {1,2}
        };
        q.minHeightShelves(books, 4);
    }
}
